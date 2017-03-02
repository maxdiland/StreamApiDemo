package com.gmail.maxdiland.streamapidemo;

import android.support.annotation.NonNull;

import com.gmail.maxdiland.streamapidemo.dto.Color;
import com.gmail.maxdiland.streamapidemo.dto.CountryCode;
import com.gmail.maxdiland.streamapidemo.dto.Product;
import com.gmail.maxdiland.streamapidemo.dto.ProductVariant;
import com.gmail.maxdiland.streamapidemo.dto.Sex;
import com.gmail.maxdiland.streamapidemo.dto.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Max Diland
 */

public final class BusinessUtil {

    private BusinessUtil() {}

    public static List<User> extractUsersByCountryCode(@NonNull List<User> users,
                                                       @NonNull CountryCode countryCode) {
        List<User> filteredUsers = new ArrayList<>();
        for (User user : users) {
            if (user.getAddress().getCountryCode() == countryCode) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }

    public static List<User> extractUsersByCountryCodeStream(@NonNull List<User> users,
                                                             @NonNull CountryCode countryCode) {
        return null;
    }


   public static boolean isAllUsersFromCountry(@NonNull List<User> users,
                                             @NonNull CountryCode countryCode) {
        for (User user : users) {
            if (user.getAddress().getCountryCode() != countryCode) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUsersFromCountryStream(@NonNull List<User> users,
                                                @NonNull CountryCode countryCode) {
        return false;
    }


    public static boolean hasAtLeastOneMale(@NonNull List<User> users) {
        for (User user : users) {
            if (user.getSex() == Sex.MALE) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasAtLeastOneMaleStream(@NonNull List<User> users) {
       return false;
    }


    public static Color getOnSaleProductFirstColor(Product product) {
        for (ProductVariant variant : product.getProductVariants()) {
            if (variant.isOnSale()) {
                return variant.getColor();
            }
        }
        return Color.NO_COLOR;
    }

    public static Color getOnSaleProductFirstColorStream(Product product) {
        return null;
    }


    public static float getProductsMaxPrice(List<Product> products) {
        float maxPrice = 0;
        for (Product product : products) {
            for (ProductVariant variant : product.getProductVariants()) {
                if (variant.isOnSale()) {
                    if (maxPrice < variant.getPrice()) {
                        maxPrice = variant.getPrice();
                    }
                }
            }
        }
        return maxPrice;
    }

    public static float getProductsMaxPriceStream(List<Product> products) {
        return 0;
    }


    public static long getOnSaleProductColorCount(Product product) {
        Set<Color> colors = new HashSet<>();
        for (ProductVariant variant : product.getProductVariants()) {
            if (variant.isOnSale()) {
                colors.add(variant.getColor());
            }
        }
        return colors.size();
    }

    public static long getOnSaleProductColorCountStream(Product product) {
        return 0L;
    }
}
