package assessment_3;
import java.util.ArrayList;

public class Menu {
    private int menuId;
    private String menuName;
    private String menuPurpose;
    private String venue;
    private String sessionTime;
    ArrayList<MenuItem> menuItems;

    public Menu(int menuId, String menuName, String menuPurpose, String venue, String sessionTime) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuPurpose = menuPurpose;
        this.venue = venue;
        this.sessionTime = sessionTime;
        this.menuItems = new ArrayList<>();
    }
    public Menu() {
        this.menuId = 0;
        this.menuName = "unknown";
        this.menuPurpose = "unknown";
        this.venue = "unknown";
        this.sessionTime = "unknown";
        this.menuItems = new ArrayList<>();
    }

    // Getters and setters

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
    }

    public MenuItem getMenuItem(int index) {
        return menuItems.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu ID: ").append(menuId).append("\n");
        sb.append("Menu Name: ").append(menuName).append("\n");
        sb.append("Purpose: ").append(menuPurpose).append("\n");
        sb.append("Venue: ").append(venue).append("\n");
        sb.append("Session Time: ").append(sessionTime).append("\n");
        sb.append("Menu Items:\n");
        for (MenuItem item : menuItems) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
