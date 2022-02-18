package display;

public class Display {

    public void printMenu(String mainTitle, String menuTitle, String... menuItems) {

        String tabSign = "\t";
        String cRet = "\n";
        String separatorSign = "-";

        System.out.print(!mainTitle.isEmpty() ? cRet + tabSign + mainTitle + cRet : "");

        System.out.println(cRet + tabSign + menuTitle);
        System.out.println(tabSign + separatorSign.repeat(menuTitle.length()));

        for (String menuItem : menuItems) {
            System.out.println(tabSign + menuItem);
        }
        System.out.println();
    }
    public void printCommandPrompt() {
        System.out.print("Your choice >> ");
    }
    public void printQuit() {
        System.out.println("Goodbye!");
    }
}
