package constants;

import java.util.Arrays;
import java.util.List;


public class HealthPlanConstants {
	
	/*
	 * Plan properties and options class that applies to Health Plans
	 * */
	private static class HealthPlanType {
		public static boolean supportsSBC;
		public static String name;
		
		public HealthPlanType(String name, boolean supportsSBC) {
			HealthPlanType.name = name;
			HealthPlanType.supportsSBC = supportsSBC;
			
		}
		
	};
	
	// all available health plan types
	public static final List<HealthPlanType> HEALTH_PLAN_TYPES = Arrays.asList(
			new HealthPlanType("AD&D", false),
			new HealthPlanType("Comprehensive Med", false),
			new HealthPlanType("Dental", false),
			new HealthPlanType("Dental Indemnity", false),
			new HealthPlanType("Dep Life", false),
			new HealthPlanType("DHMO", false),
			new HealthPlanType("DPO", false),
			new HealthPlanType("EPO", false),
			new HealthPlanType("EPO w/HRA", false),
			new HealthPlanType("EPO w/HSA", false),
			new HealthPlanType("FSA", false),
			new HealthPlanType("HMO", false),
			new HealthPlanType("HMO w/HRA", false),
			new HealthPlanType("HMO w/HSA", false),
			new HealthPlanType("Life Insurance", false),
			new HealthPlanType("LTD", false),
			new HealthPlanType("Medical", false),
			new HealthPlanType("Medical Indemnity", false),
			new HealthPlanType("OAP", false),
			new HealthPlanType("OAP w/HRA", false),
			new HealthPlanType("OAP w/HSA", false),
			new HealthPlanType("POS", false),
			new HealthPlanType("POS w/HRA", false),
			new HealthPlanType("POS w/HSA", false),
			new HealthPlanType("PPO", false),
			new HealthPlanType("PPO w/HRA", false),
			new HealthPlanType("PPO w/HSA", false),
			new HealthPlanType("STD", false),
			new HealthPlanType("Supp Life", false),
			new HealthPlanType("Supplemental", false),
			new HealthPlanType("Vision", false),
			new HealthPlanType("Vol Dep Life", false)
	);
	
	public static final String[] CLIENTS = {"Trovato Holdings LLC"};
	public static final String[] CARRIERS = {"UHC - Test Carrier"};
	
}
