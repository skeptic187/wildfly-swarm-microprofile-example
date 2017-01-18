package com.example;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;


public class Main {
					
	public static void main(String[] args) throws Exception {
		Swarm swarm = new Swarm();	
		swarm.start();

		JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
		deployment.addResource(com.example.EmployeeResource.class);
		deployment.addAllDependencies();
		
		swarm.deploy(deployment);
	}
 
}