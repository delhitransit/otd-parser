/*
 * @author Tanmay Singal
 */

package com.delhitransit.core;

import com.delhitransit.core.controller.AdminController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CoreApplication {

    private static AdminController adminController = null;

    @Autowired
    public CoreApplication(AdminController adminController) {
        CoreApplication.adminController = adminController;
    }

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CoreApplication.class, args);
        if (adminController != null) {
            adminController.initializeDatabase();
        }
    }

}
