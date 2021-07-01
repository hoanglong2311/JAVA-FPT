/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;


public class EmManager {

    ArrayList<Employee> el = new ArrayList<>();

    public EmManager() {
    }

    void Enter() {
        el.add(new Employee("A05", "Tran Quang", 7));
        el.add(new Employee("A03", "Nguyen An", 7));
        el.add(new Employee("A01", "Truong Phung", 5));
        el.add(new Employee("A04", "Pham Thi Lam", 2));
        el.add(new Employee("A02", "Do Trung Ton", 5));
    }
 
    public void selectionSortA() {
        for (int i = 0; i < el.size() - 1; i++) {
            int max = i;
            for (int j = i + 1; j < el.size(); j++) {
                if (el.get(max).compareTo(el.get(j)) < 0) {
                    max = j;
                }
            }
            if (max != i) {
                Employee temp = el.get(max);
                el.set(max, el.get(i));
                el.set(i, temp);
            }
        }
    }

    public void insertionSort() {
        int n = el.size();
        for (int i = 0; i < n; i++) {
            String key = el.get(i).getId();
            int j = i - 1;
            while (j >= 0 && el.get(j).getId().compareTo(key) > 0) {
                el.get(j + 1).setId(el.get(j).getId());
                j = j - 1;
            }
            el.get(j + 1).setId(key);
        }
    }

    public void bubbleSort() {
//        for (int i = 1; i < el.size(); i++) {
//            for (int j = 0; j < el.size() - i; j++) {
//                if ((el.get(i).getId().compareToIgnoreCase(el.get(i).getId())) > 0) {
//                    Employee temp = el.get(i);
//                    el.set(i, el.get(i + 1));
//                    el.set(i + 1, temp);
//                }
//            }
//        }
        Employee temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < el.size() - 1; i++) {
                if (el.get(i).getId().compareTo(el.get(i + 1).getId()) > 0) {
                    temp = el.get(i);
                    el.set(i, el.get(i + 1));
                    el.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

    public void quickSort(ArrayList<Employee> a, int left, int right) {
        if (a == null || a.size() == 0) {
            return;
        }
        if (left >= right) {
            return;
        }
        int middle = left + (right - left) / 2;
        String pivot = el.get(middle).getId();
        int i = left, j = right;
        while (i <= j) {
            while (a.get(i).getId().compareTo(pivot) < 0) {
                i++;
            }
            while (a.get(j).getId().compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Employee temp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(a, left, j);
        }
        if (right > i) {
            quickSort(a, i, right);
        }
    }

    public void quickSortRun() {
        quickSort(el, 0, el.size() - 1);
    }

    public void merge() {
    }

    // public void display() {
    //     el.forEach((e) -> {
    //         System.out.println(e.toString());
    //     });
    // }

    public void display() {
        System.out.printf("| %-10s | %-13s | %-5s |\n", "ID", "Name","Level");
        for (Employee employee : el) {
            System.out.printf("| %-10s | %-13s | %5d |\n", employee.getId(), employee.geteName(), employee.getLevel());
        }
    }
}

// "| %-10s | %-13s | %5d |"