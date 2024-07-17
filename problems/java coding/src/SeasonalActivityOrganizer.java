import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SeasonalActivityOrganizer {
	 private final Map<Season, EnumSet<Activity>> seasonActivitiesMap;

	    public SeasonalActivityOrganizer() {
	        seasonActivitiesMap = new HashMap<>();
	        for (Season season : Season.values()) {
	            seasonActivitiesMap.put(season, EnumSet.noneOf(Activity.class));
	        }
	    }

	    public Set<Activity> getActivitiesForSeason(Season season) {
	        EnumSet<Activity> activities = seasonActivitiesMap.get(season);
	        if (activities == null) {
	            throw new IllegalArgumentException("Unknown season: " + season);
	        }
	        return activities;
	    }

	    public Set<Activity> addActivityForSeason(Activity activity, Season season) {
	        EnumSet<Activity> activities = seasonActivitiesMap.get(season);
	        if (activities == null) {
	            throw new IllegalArgumentException("Unknown season: " + season);
	        }
	        activities.add(activity);
	        return activities;
	    }

	    public void removeActivityFromAllSeasons(Activity activity) {
	        for (EnumSet<Activity> activities : seasonActivitiesMap.values()) {
	            activities.remove(activity);
	        }
	    }

	    public Set<Activity> getAllActivities() {
	        EnumSet<Activity> allActivities = EnumSet.noneOf(Activity.class);
	        for (EnumSet<Activity> activities : seasonActivitiesMap.values()) {
	            allActivities.addAll(activities);
	        }
	        return allActivities;
	    }

	    public static void main(String[] args) {
	        SeasonalActivityOrganizer organizer = new SeasonalActivityOrganizer();
	        organizer.addActivityForSeason(Activity.HIKING, Season.SPRING);
	        organizer.addActivityForSeason(Activity.SWIMMING, Season.SUMMER);
	        organizer.addActivityForSeason(Activity.SKIING, Season.WINTER);

	        System.out.println(organizer.getAllActivities()); 
	        System.out.println(organizer.getActivitiesForSeason(Season.SPRING));
	        System.out.println(organizer.getActivitiesForSeason(Season.SUMMER)); 
	        System.out.println(organizer.getActivitiesForSeason(Season.WINTER));

	        organizer.removeActivityFromAllSeasons(Activity.HIKING);
	        System.out.println(organizer.getActivitiesForSeason(Season.SPRING)); 
	    }

}
