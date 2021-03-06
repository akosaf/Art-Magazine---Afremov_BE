package com.codecool.fileshare.input;

import com.codecool.fileshare.controller.ConsoleController;
import com.codecool.fileshare.display.Display;
import com.codecool.fileshare.requests.Request;

import java.util.Scanner;

import static com.codecool.fileshare.connect.Connect.createConnection;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ConsoleController consoleController = new ConsoleController();
    Request request = new Request();

    private Display display = new Display();

    public enum MainMenu {
        CONNECT_DATABASE,
        CHECK_DATABASE,
        DOWNLOAD,
        UPLOAD,
        QUERY_EXECUTION,
        QUIT
    }

    public enum QueryMenu {
        DELETE_IMAGE_BY_NUMBER,
        DELETE_IMAGE_BY_CATEGORY,
        CHANGE_IMAGE_CATEGORY,
        STATISTICS,
        BACK_TO_MAIN_MENU
    }

    public void mainMenu() {
        MainMenu menuSelection;
        do {
            menuSelection = getMainMenuInput(display);

            switch (menuSelection) {
                case CONNECT_DATABASE:
                    connectDb();
                    System.out.println("connecting...");
                    return;
                case CHECK_DATABASE:
                    request.getRequest();
                    break;
                case DOWNLOAD:
                    System.out.println("ID:");
                    request.getRequest(scanner.nextInt());
                    break;
                case UPLOAD:
                    System.out.println("uploading");
                    break;
                case QUERY_EXECUTION:
                    getQueryMenuInput(display);
                    break;

            }
        } while (menuSelection != menuSelection.QUIT);
        display.printQuit();
    }

    private void connectDb() {
        String username;
        System.out.println("Username:");
        username = scanner.nextLine();
        System.out.println("Password:");
        createConnection(username, scanner.nextLine());
    }

    public MainMenu getMainMenuInput(Display display) {

        String choice;
        display.printMenu("------ Art Magazine Console ------",
                "Please choose from the following:",
                "1 - Connect to the database",
                "2 - Check database",
                "3 - Download Json",
                "4 - Upload Json",
                "5 - Query execution",
                "6 - Quit");


        while (true) {
            display.printCommandPrompt();
            if (scanner.hasNextLine()) {
                choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        return MainMenu.CONNECT_DATABASE;
                    case "2":
                        return MainMenu.CHECK_DATABASE;
                    case "3":
                        return MainMenu.DOWNLOAD;
                    case "4":
                        return MainMenu.UPLOAD;
                    case "5":
                        return MainMenu.QUERY_EXECUTION;
                    case "6":
                        return MainMenu.QUIT;
                    default:
                        ;
                }
            }
        }
    }

    public QueryMenu getQueryMenuInput(Display display) {

        String choice;


        while (true) {
            display.printMenu("",
                    "Which query to run:",
                    "1 - Delete image by number",
                    "2 - Delete image by category",
                    "3 - Change image category",
                    "4 - Statistics",
                    "5 - Back to main menu");
            display.printCommandPrompt();
            if (scanner.hasNextLine()) {
                choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        System.out.println("DELETE_IMAGE_BY_NUMBER");
                        break;
                    case "2":
                        System.out.println("DELETE_IMAGE_BY_CATEGORY");
                        break;
                    case "3":
                        System.out.println("CHANGE_IMAGE_CATEGORY");
                        break;
                    case "4":
                        System.out.println("STATISTICS");
                        break;
                    case "5":
                        return QueryMenu.BACK_TO_MAIN_MENU;
                    default:
                        ;
                }
            }
        }
    }
}
