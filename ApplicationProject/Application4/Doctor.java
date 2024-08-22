package com.evergent.CoreJava.Rithen.Application4;

class Doctor extends AbstractDoctor {
    private static final int ONLINE_COST = 1000;
    private static final int OFFLINE_COST = 1500;
    private static final int PHONECALL_COST = 600;
    
    static {
    	System.out.println("___________Welcome to MindCareSystem Application____________");
    }

    public Doctor(String name, String profession, int experience, String ratings, String[] languages, String[] counselingFor) {
        super(name, profession, experience, ratings, languages, counselingFor);
    }

    public int getSessionCost(String sessionType) {
        switch (sessionType) {
            case "online":
                return ONLINE_COST;
            case "offline":
                return OFFLINE_COST;
            case "phonecall":
                return PHONECALL_COST;
            default:
                return 0;
        }
    }

    public String getDetails() {
        return String.format("Name: %s\nProfession: %s\nExperience: %d years\nRatings: %s\nLanguages: %s\nCounseling For: %s",
                name, profession, experience, ratings, String.join(", ", languages), String.join(", ", counselingFor));
    }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

