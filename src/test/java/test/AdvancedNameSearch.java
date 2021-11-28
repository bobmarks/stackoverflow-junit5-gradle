package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AdvancedNameSearch {

    @BeforeAll
    public static void setup () {
        System.out.println("Feature: Adv Name Search");
        System.out.println();
        System.out.println("Tests the advanced name search feature in IMDB");
        System.out.println();
    }

    @Test
    public void search_by_name_v1() {
        System.out.println("      Scenario: Search by name v1");
        System.out.println("");
        System.out.println("        Given I am at the homepage                          ");
        System.out.println("         When I search for name Brad Pitt                   ");
        System.out.println("          And I click the search button2                    ");
        System.out.println("         Then I expect to see results with name 'Brad Pitt' ");
        System.out.println("");
    }

    @Test
    public void search_by_name_v2() {
        System.out.println("      Scenario: Search by name v2");
        System.out.println("");
        System.out.println("        Given I am at the homepage                          ");
        System.out.println("         When I search for name Tom Cruise                   ");
        System.out.println("          And I click the search button2                    ");
        System.out.println("         Then I expect to see results with name 'Tom Cruise' ");
        System.out.println("");
    }

}
