package com.gmail.maxdiland.streamapidemo;

import com.gmail.maxdiland.streamapidemo.dto.Address;
import com.gmail.maxdiland.streamapidemo.dto.Color;
import com.gmail.maxdiland.streamapidemo.dto.CountryCode;
import com.gmail.maxdiland.streamapidemo.dto.Product;
import com.gmail.maxdiland.streamapidemo.dto.ProductVariant;
import com.gmail.maxdiland.streamapidemo.dto.Sex;
import com.gmail.maxdiland.streamapidemo.dto.Size;
import com.gmail.maxdiland.streamapidemo.dto.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Diland
 */

public class BusinessUtilTestDataProvider {

    protected List<User> getUsersFromUa() {
        return new ArrayList<User>(){{
            add(new User(){{
                setName("Alex");
                setAge(22);
                setSex(Sex.MALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.UA);
                    setCity("Kharkov");
                    setPostalCode(13039);
                }});
            }});

            add(new User(){{
                setName("Boris");
                setAge(24);
                setSex(Sex.MALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.UA);
                    setCity("Kharkov");
                    setPostalCode(13039);
                }});
            }});

            add(new User(){{
                setName("Gleb");
                setAge(21);
                setSex(Sex.MALE);
                setAddress(new Address() {{
                    setCountryCode(CountryCode.UA);
                    setCity("Kharkov");
                    setPostalCode(13039);
                }});
            }});
        }};
    }

    protected List<User> getFemaleUsers() {
        return new ArrayList<User>(){{
            add(new User(){{
                setName("Agnieszka");
                setAge(23);
                setSex(Sex.FEMALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.PL);
                    setCity("Krakow");
                    setPostalCode(31231);
                }});
            }});

            add(new User(){{
                setName("Justyna");
                setAge(26);
                setSex(Sex.FEMALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.PL);
                    setCity("Krakow");
                    setPostalCode(31231);
                }});
            }});
        }};
    }

    protected List<User> getUsersFromPl() {
        return new ArrayList<User>(){{
            add(new User(){{
                setName("Kamil");
                setAge(29);
                setSex(Sex.MALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.PL);
                    setCity("Krakow");
                    setPostalCode(31231);
                }});
            }});

            add(new User(){{
                setName("Paweł");
                setAge(27);
                setSex(Sex.MALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.PL);
                    setCity("Krakow");
                    setPostalCode(31231);
                }});
            }});

            add(new User(){{
                setName("Agnieszka");
                setAge(23);
                setSex(Sex.FEMALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.PL);
                    setCity("Krakow");
                    setPostalCode(31231);
                }});
            }});

            add(new User(){{
                setName("Justyna");
                setAge(26);
                setSex(Sex.FEMALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.PL);
                    setCity("Krakow");
                    setPostalCode(31231);
                }});
            }});
        }};
    }


    protected List<User> getUsersFromRu() {
        return new ArrayList<User>(){{
            add(new User(){{
                setName("Jurij");
                setAge(24);
                setSex(Sex.MALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.RU);
                    setCity("Saratov");
                    setPostalCode(87485);
                }});
            }});

            add(new User(){{
                setName("Anton");
                setAge(28);
                setSex(Sex.MALE);
                setAddress(new Address(){{
                    setCountryCode(CountryCode.RU);
                    setCity("Saratov");
                    setPostalCode(87485);
                }});
            }});
        }};
    }

    protected List<User> getUsers() {
        return new ArrayList<User>(){{
            addAll(getUsersFromUa());
            addAll(getUsersFromPl());
            addAll(getUsersFromRu());
        }};
    }

    protected List<Product> getProducts() {
        return new ArrayList<Product>() {{
            add(getProductJeans());
            add(getProductSweater());
        }};
    }

    protected Product getProductJeans() {
        return new Product() {{
            setName("Kelvin Klein Men Jeans Regular");
            setProductVariants(new ArrayList<ProductVariant>(){{
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.BLUE);
                    setOnSale(false);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.GREEN);
                    setOnSale(false);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.RED);
                    setOnSale(true);
                    setPrice(72.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.BLUE);
                    setOnSale(true);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.GREEN);
                    setOnSale(true);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.RED);
                    setOnSale(true);
                    setPrice(72.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.BLUE);
                    setOnSale(true);
                    setPrice(60.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.GREEN);
                    setOnSale(true);
                    setPrice(60.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.RED);
                    setOnSale(true);
                    setPrice(79.0f);
                }});
            }});
        }};
    }

    protected Product getSoldProduct() {
        return new Product() {{
            setName("Kelvin Klein Men Jeans Regular");
            setProductVariants(new ArrayList<ProductVariant>(){{
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.BLUE);
                    setOnSale(false);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.GREEN);
                    setOnSale(false);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.RED);
                    setOnSale(false);
                    setPrice(72.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.BLUE);
                    setOnSale(false);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.GREEN);
                    setOnSale(false);
                    setPrice(50.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.RED);
                    setOnSale(false);
                    setPrice(72.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.BLUE);
                    setOnSale(false);
                    setPrice(60.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.GREEN);
                    setOnSale(false);
                    setPrice(60.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.RED);
                    setOnSale(false);
                    setPrice(79.0f);
                }});
            }});
        }};
    }


    protected Product getProductSweater() {
        return new Product() {{
            setName("Tommy Hilfiger SHAWL COLLAR");
            setProductVariants(new ArrayList<ProductVariant>(){{
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.BLUE);
                    setOnSale(true);
                    setPrice(80.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.GREEN);
                    setOnSale(true);
                    setPrice(85.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.S);
                    setColor(Color.RED);
                    setOnSale(true);
                    setPrice(75.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.BLUE);
                    setOnSale(true);
                    setPrice(80.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.GREEN);
                    setOnSale(true);
                    setPrice(85.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.M);
                    setColor(Color.RED);
                    setOnSale(true);
                    setPrice(75.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.BLUE);
                    setOnSale(true);
                    setPrice(85.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.GREEN);
                    setOnSale(true);
                    setPrice(90.0f);
                }});
                add(new ProductVariant(){{
                    setSize(Size.L);
                    setColor(Color.RED);
                    setOnSale(true);
                    setPrice(75.0f);
                }});
            }});
        }};
    }
}
