package com.gmail.maxdiland.streamapidemo;

import com.gmail.maxdiland.streamapidemo.dto.Color;
import com.gmail.maxdiland.streamapidemo.dto.CountryCode;
import com.gmail.maxdiland.streamapidemo.dto.Product;
import com.gmail.maxdiland.streamapidemo.dto.User;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Max Diland
 */

public class BusinessUtilTest extends BusinessUtilTestDataProvider {

    @Test
    public void extractUsersByCountryCodeTest() {
        List<User> users = getUsers();
        List<User> usersFromPlExpected = BusinessUtil.extractUsersByCountryCode(
                users, CountryCode.PL);

        List<User> usersFromPlActual = BusinessUtil.extractUsersByCountryCodeStream(
                users, CountryCode.PL);

        Assert.assertEquals(usersFromPlExpected, usersFromPlActual);
    }


    @Test
    public void isAllUsersFromCountryTest() {
        List<User> usersFromUa = getUsersFromUa();

        boolean expected = BusinessUtil.isAllUsersFromCountry(usersFromUa, CountryCode.UA);
        boolean actual = BusinessUtil.isAllUsersFromCountryStream(usersFromUa, CountryCode.UA);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isAllUsersFromCountryNegativeTest() {
        List<User> users = getUsers();

        boolean expected = BusinessUtil.isAllUsersFromCountry(users, CountryCode.UA);
        boolean actual = BusinessUtil.isAllUsersFromCountryStream(users, CountryCode.UA);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasAtLeastOneMaleTest() {
        List<User> users = getUsers();

        boolean expected = BusinessUtil.hasAtLeastOneMale(users);
        boolean actual = BusinessUtil.hasAtLeastOneMaleStream(users);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasAtLeastOneMaleNegativeTest() {
        List<User> users = getFemaleUsers();

        boolean expected = BusinessUtil.hasAtLeastOneMale(users);
        boolean actual = BusinessUtil.hasAtLeastOneMaleStream(users);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOnSaleProductFirstColorTest() {
        Product product = getProductJeans();

        Color expected = BusinessUtil.getOnSaleProductFirstColor(product);
        Color actual = BusinessUtil.getOnSaleProductFirstColorStream(product);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOnSaleProductFirstColorNegativeTest() {
        Product product = getSoldProduct();

        Color expected = BusinessUtil.getOnSaleProductFirstColor(product);
        Color actual = BusinessUtil.getOnSaleProductFirstColorStream(product);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getOnSaleProductsMaxPriceTest() {
        List<Product> products = getProducts();

        float expected = BusinessUtil.getProductsMaxPrice(products);
        float actual = BusinessUtil.getProductsMaxPriceStream(products);
        Assert.assertEquals(expected, actual, 0d);
    }

    @Test
    public void getOnSaleProductColorCountTest() {
        Product product = getProductJeans();

        long expected = BusinessUtil.getOnSaleProductColorCount(product);
        long actual = BusinessUtil.getOnSaleProductColorCountStream(product);
        Assert.assertEquals(expected, actual);
    }
}
