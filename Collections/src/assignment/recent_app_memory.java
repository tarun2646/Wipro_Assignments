package assignment;
import java.util.LinkedList;

public class recent_app_memory {
    public static void main(String[] args) {
        LinkedList<String> recentApps = new LinkedList<>();

        openApp(recentApps, "WhatsApp");
        openApp(recentApps, "YouTube");
        openApp(recentApps, "Instagram");
        openApp(recentApps, "WhatsApp");  // Move to top
        openApp(recentApps, "Twitter");
        System.out.println("Recent Apps: " + recentApps);
    }

    public static void openApp(LinkedList<String> list, String app) {
        list.remove(app);          // Remove if already opened
        list.addFirst(app);

}

}
