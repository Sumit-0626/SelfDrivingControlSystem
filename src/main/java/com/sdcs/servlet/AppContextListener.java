package com.sdcs.servlet;

import com.sdcs.service.VehicleLocationUpdater;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@WebListener
public class AppContextListener implements ServletContextListener {

    private ScheduledExecutorService scheduler;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // start scheduled executor
        scheduler = Executors.newSingleThreadScheduledExecutor();
        VehicleLocationUpdater updater = new VehicleLocationUpdater();

        // run first after 5 sec, then every 5 sec
        scheduler.scheduleAtFixedRate(updater, 5, 5, TimeUnit.SECONDS);

        sce.getServletContext().setAttribute("vehicleLocationScheduler", scheduler);
        System.out.println("VehicleLocationUpdater scheduled every 5s");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // stop scheduler
        Object obj = sce.getServletContext().getAttribute("vehicleLocationScheduler");
        if (obj instanceof ScheduledExecutorService) {
            ScheduledExecutorService s = (ScheduledExecutorService) obj;
            s.shutdownNow();
        }
        System.out.println("VehicleLocationUpdater stopped");
    }
}
