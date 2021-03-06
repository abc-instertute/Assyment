package com.sliit.mtit.paymentDatabase;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	//Registering the  database service
	ServiceRegistration serviceRegistration;


	public void start(BundleContext context) throws Exception {
		System.out.println("Started Payment Database ");
		DBService dbService = (DBService) new dbServiceImpl();
		serviceRegistration = context.registerService(DBService.class.getName(), dbService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Ended Payment Database");
		serviceRegistration.unregister();
	}

}
