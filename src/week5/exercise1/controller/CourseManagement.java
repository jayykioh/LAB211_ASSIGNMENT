    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package week5.exercise1.controller;

    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.time.format.DateTimeParseException;
    import java.util.ArrayList;
    import java.util.Scanner;
    import javax.swing.text.DateFormatter;
    import week4.exercise1.view.CheckInput;
    import week5.exercise1.model.OfflineCourse;
    import week5.exercise1.model.OnlineCourse;

    /**
     *
     * @author FPT
     */
    public class CourseManagement {

        ArrayList<OnlineCourse> onlcrslist = new ArrayList<>();
        ArrayList<OfflineCourse> offcrslist = new ArrayList<>();

        public void addCourse() {
            String choice;
            while (true) {
                System.out.print("Online(O) or Offline(F): ");
                choice = CheckInput.inputString();
                if (choice.equalsIgnoreCase("O") || choice.equalsIgnoreCase("F")) {
                    break;
                }
                System.out.println("Data Input is invalid");
            }
            if (choice.equalsIgnoreCase("O")) {
                System.out.println("Create new online course: ");
            } else if (choice.equalsIgnoreCase("F")) {
                System.out.println("Create new offline course: ");
            }
            String id;
            while (true) {
                System.out.println("Course ID: ");
                id = CheckInput.inputString();
                if (id.isEmpty()) {
                    System.out.println("Data input is invalid, id must be not null!");
                    continue;
                }
                boolean exists = false;
                for (OnlineCourse c : onlcrslist) {
                    if (c.getCourseid().equalsIgnoreCase(id)) {
                        System.out.println("Data input is invalid, id must be unique!");
                        exists = true;
                        break;
                    }
                }
                for (OfflineCourse c : offcrslist) {
                    if (c.getCourseid().equalsIgnoreCase(id)) {
                        System.out.println("Data input is invalid, id must be unique!");
                        exists=true;
                        break;
                    }
                }

                if (!exists) {
                    break;
                }
            }
            System.out.print("Enter Course Name: ");
            String courseName = CheckInput.inputString();
            int credits;
            while (true) {
                System.out.print("Enter Credits: ");
                credits = CheckInput.inputPositiveInt();
                if (credits > 0) {
                    break;
                }
                System.out.println("Credits must be greater than 0!");
            }
            if (choice.equalsIgnoreCase("O")) {
                String platform;
                String instructor;
                String note;
                while (true) {
                    System.out.println("Enter platform: ");
                    platform = CheckInput.inputString();
                    System.out.println("Enter instructor: ");
                    instructor = CheckInput.inputString();
                    System.out.println("Enter note: ");
                    note = CheckInput.inputString();
                    if (platform.isEmpty() || instructor.isEmpty() || note.isEmpty()) {
                        System.out.println("Data invalid, platform,instructor,note are not empty!");
                    } else {
                        break;
                    }
                }
                OnlineCourse onlineCourse = new OnlineCourse();
                onlineCourse.InputAll(id, credits, courseName, platform, instructor, note);
                onlcrslist.add(onlineCourse);
                System.out.println("Add successfully");
            } else if (choice.equalsIgnoreCase("F")) {
                String campus;
                LocalDate begin;
                LocalDate end;
                while (true) {
                    System.out.println("Enter begin date: ");
                    begin = CheckInput.inputDate();
                    System.out.println("Enter end date: ");
                    end = CheckInput.inputDate();
                    System.out.println("Enter campus: ");
                    campus = CheckInput.inputString();

                    if (campus.isEmpty()) {
                        System.out.println("Campus cannot be empty, Please enter again.");
                        continue;
                    }
                    if (!begin.isBefore(end)) {
                        System.out.println("Begin date must be before end date");
                        continue;
                    }
                    break;
                }
                OfflineCourse offlineCourse = new OfflineCourse();
                offlineCourse.InputAll(id, credits, courseName, begin, end, campus);
                offcrslist.add(offlineCourse);
                System.out.println("Add successfully");
            }
        }

        public void updateCrs() {
            System.out.println("***Update Course****");
            System.out.println("Course ID: ");
            Scanner sc = new Scanner(System.in);
            String id = CheckInput.inputString();
            OnlineCourse searchonlcrs = null;
            for (OnlineCourse onlcrs : onlcrslist) {
                if (onlcrs.getCourseid().equalsIgnoreCase(id)) {
                    searchonlcrs = onlcrs;
                    break;
                }
            }
            OfflineCourse searchoffcrs = null;
            for (OfflineCourse offcrs : offcrslist) {
                if (offcrs.getCourseid().equalsIgnoreCase(id)) {
                    searchoffcrs = offcrs;
                    break;
                }
            }

            if (searchonlcrs == null && searchoffcrs == null) {
                System.out.println("Course ID not found!");
                return;
            }

            System.out.println("*** Search result ***");
            System.out.println(searchonlcrs != null ? searchonlcrs : searchoffcrs);

            System.out.println("*** Updating Course ***");
            System.out.println("Note: Press Enter to skip an update.");
            System.out.println("Course Name: ");
            String newname = sc.nextLine();
            if (!newname.isEmpty() && !newname.isBlank()) {
                if (searchoffcrs != null) {
                    searchoffcrs.setCoursename(newname);
                }
                if (searchonlcrs != null) {
                    searchonlcrs.setCoursename(newname);
                }
            }
            System.out.println("Credit: ");
            String newcredit = sc.nextLine();
            if (!newcredit.isBlank() && !newcredit.isEmpty()) {
                int newcredit2 = Integer.parseInt(newcredit);
                if (searchoffcrs != null) {
                    searchoffcrs.setCredits(newcredit2);
                }
                if (searchonlcrs != null) {
                    searchonlcrs.setCredits(newcredit2);
                }
            }

            if (searchoffcrs != null) {
                System.out.println("Begin: ");
                String begindate = sc.nextLine();
                DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate begin = null;
                if (!begindate.isEmpty()) {
                    try {
                        begin = LocalDate.parse(begindate, DATE_FORMATTER);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format! Please enter in dd-MM-yyyy.");
                        return;
                    }
                }

                System.out.println("End: ");
                String enddate = sc.nextLine();
                LocalDate end = null;
                if (!enddate.isEmpty()) {
                    try {
                        end = LocalDate.parse(enddate, DATE_FORMATTER);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format! Please enter in dd-MM-yyyy.");
                        return;
                    }
                }

                if (  begin != null && end != null ) {
                    if (begin.isBefore(end)) {
                        searchoffcrs.setBegin(begin);
                        searchoffcrs.setEnd(end);
                    }
                }

                System.out.println("Campus: ");
                String campues = sc.nextLine();
                if (!campues.isEmpty() && !campues.isBlank()) {
                    searchoffcrs.setCampus(campues);
                }
                System.out.println("Updated succesffuly");
            } else if (searchonlcrs != null) {
                System.out.println("Platfrom: ");
                String flatform = sc.nextLine();
                if (!flatform.isBlank() && !flatform.isEmpty()) {
                    searchonlcrs.setPlatforms(flatform);
                }
                System.out.println("Instructos: ");
                String instructor = sc.nextLine();
                if (!instructor.isEmpty() && !instructor.isBlank()) {
                    searchonlcrs.setInstructors(instructor);
                }
                System.out.println("Node: ");
                String note = sc.nextLine();
                if (!note.isBlank() && !note.isEmpty()) {
                    searchonlcrs.setNotes(note);
                }
            }
            System.out.println("Updated successfully");

        }

        public void deleteCourse() {
            while (true) {
                System.out.println("Course ID: ");
                String id = CheckInput.inputString();
                boolean check = false;
                for (OnlineCourse c : onlcrslist) {
                    if (c.getCourseid().equalsIgnoreCase(id)) {
                        System.out.println("Course ID found!");
                        System.out.println("Deleting......");
                        onlcrslist.remove(c);
                        System.out.println("Deleting succesfully");
                        check = true;
                        break;
                    }
                }
                for (OfflineCourse c : offcrslist) {
                    if (c.getCourseid().equalsIgnoreCase(id)) {
                        System.out.println("Course ID found!");
                        System.out.println("Deleting......");
                        offcrslist.remove(c);
                        System.out.println("Deleting succesfully");
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("No data found, do you want to find again: (Y/N) ");
                    String choice = CheckInput.inputString();
                    if (choice.equalsIgnoreCase("N")) {
                        break;
                    }
                } else {
                    return;
                }
            }
        }

        public void showOffOnlCrs() {
            System.out.println("******Online Course*****");
            if (onlcrslist.isEmpty()) {
                System.out.println("Online Course is empty");
            }
            for (OnlineCourse c1 : onlcrslist) {
                System.out.println(c1);
            }
            System.out.println("******Offline Course*****");
            if (offcrslist.isEmpty()) {
                System.out.println("Offline Course is empty");
            }
            for (OfflineCourse c2 : offcrslist) {
                System.out.println(c2);
            }
            System.out.println();
        }

        public void searchbycrsname() {
            System.out.println("Enter Course Name: ");
            String crsname = CheckInput.inputString();
            OnlineCourse searchonlcrs = null;
            OfflineCourse searchoffcrs = null;
            for (OnlineCourse c : onlcrslist) {
                if (c.getCoursename().equalsIgnoreCase(crsname)) {
                    searchonlcrs = c;
                    break;
                }
            }
            for (OfflineCourse c : offcrslist) {
                if (c.getCoursename().equalsIgnoreCase(crsname)) {
                    searchoffcrs = c;
                    break;
                }
            }
            if (searchoffcrs != null) {
                System.out.println("***Course  found****");
                System.out.println(searchonlcrs);
            } else if (searchonlcrs != null) {
                System.out.println("****Course found****");
                System.out.println(searchonlcrs);
            }
        }

    }
