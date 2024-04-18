package com.example.shop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.shop.domain.Product;
import com.example.shop.domain.User;
import com.example.shop.service.ProductService;
import com.example.shop.service.UserService;

@Component
public class StartupData implements CommandLineRunner {
    private final UserService userService;
    private final ProductService productService;

    public StartupData(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @Override
    public void run(String... args) {
        adminAccount();
        userAccount();
        exampleProducts();
    }

    private void userAccount() {
        User user = new User();

        user.setUsername("user");
        user.setPassword("user");
        user.setPasswordConfirm("user");
        user.setEmail("user@example.com");

        userService.save(user);
    }

    private void adminAccount() {
        User admin = new User();

        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setPasswordConfirm("admin");
        admin.setEmail("admin@example.com");

        userService.save(admin);
    }

    private void exampleProducts() {

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();

        product1.setName("Lavazza");
        product1.setImageUrl("https://m.media-amazon.com/images/I/61AFYDJPOXL._AC_UL320_.jpg");
        product1.setDescription("32pcs");
        product1.setPrice(27.35);

        product2.setName("L’OR Le Tigre");
        product2.setImageUrl(
                "https://lorcoffee.com/cdn/shop/products/BARISTAKV5_FB_Le_Tigre_LEFT_capsules_210722-800x800.png?v=1688577028.jpg");
        product2.setDescription("30pcs");
        product2.setPrice(26.79);

        product3.setName("Bestpresso");
        product3.setImageUrl("https://m.media-amazon.com/images/I/61Ufmh2fZCL._AC_UL320_.jpg");
        product3.setDescription("20pcs");
        product3.setPrice(30.71);

        product4.setName("Grand Milano");
        product4.setImageUrl("https://m.media-amazon.com/images/I/81SioMXEyAL._AC_UL320_.jpg");
        product4.setDescription("10pcs");
        product4.setPrice(21.99);

        product5.setName("NESCAFÉ GOLD");
        product5.setImageUrl(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTHI4GuzkTKd0Sbk3aJA3_CXEQk0wBcYN0TT7XUgV5OQ&s.jpg");
        product5.setDescription("30pcs");
        product5.setPrice(18.99);

        product6.setName("Davidoff 57 Ristretto");
        product6.setImageUrl(
                "https://www.bigbasket.com/media/uploads/p/l/40284940_1-davidoff-espresso-57-ristretto-dark-chocolatey-coffee-capsules-100-arabica.jpg");
        product6.setDescription("10pcs");
        product6.setPrice(17.31);

        product7.setName("Segafredo Zanetti");
        product7.setImageUrl(
                "https://boncafe.com/media/2022/11/Segafredo-Zanetti-Coffee-Capsules-100pct-arabica-Carton-1.jpeg");
        product7.setDescription("10pcs x 1 Carton");
        product7.setPrice(62.50);

        product8.setName("Safari Lounge");
        product8.setImageUrl(
                "https://cdnprod.mafretailproxy.com/sys-master-root/hce/h9b/14192729587742/57381_main.jpg_480Wx480H");
        product8.setDescription("10pcs");
        product8.setPrice(22.69);

        productService.save(product1);
        productService.save(product2);
        productService.save(product3);
        productService.save(product4);
        productService.save(product5);
        productService.save(product6);
        productService.save(product7);
        productService.save(product8);

    }
}
