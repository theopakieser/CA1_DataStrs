package com.example.ca1_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheListTest {

    public TheList<Port> portsList, portsListEmpty;
    private Port p1, p2, p3;

    public TheList<Ship> shipsList, shipsListEmpty;
    private Ship s1, s2, s3;

    public TheList<Container> containersList, containersListEmpty;
    private Container c1, c2, c3;

    public TheList<Pallet> palletsList, palletsListEmpty;
    private Pallet pl1, pl2, pl3;

    @BeforeEach
    void setUp() {
        portsList = new TheList<>();
        portsListEmpty = new TheList<>();
        p1 = new Port("A", 1, "China");
        p2 = new Port("b", 22, "America");
        p3 = new Port("c", 333, "Ireland");

        shipsList = new TheList<>();
        shipsListEmpty = new TheList<>();
        s1 = new Ship("aC", "01C", "China", "qwertyuiop", "A");
        s2 = new Ship("bA", "024A","New York", "asdfghjkl", "b");
        s3=new Ship("cI", "250I", "Dublin", "zmxncbv", "c" );

        containersList = new TheList<>();
        containersListEmpty = new TheList<>();
        c1 = new Container("23", 23, "aC");
        c2 = new Container("64", 10, "bA");
        c3 = new Container("034", 39, "cI");

        palletsList = new TheList<>();
        palletsListEmpty = new TheList<>();
        pl1=new Pallet("coal", 20000, "10000", 2034, 60, "23");
        pl2=new Pallet("oil", 2305, "23000", 403, 50, "10");
        pl3=new Pallet("Oranges", 3000, "4000", 4500, 69, "034");

        portsList.addElement(p1);
        portsList.addElement(p2);
        shipsList.addElement(s1);
        containersList.addElement(c1);
        palletsList.addElement(pl1);
    }

    @AfterEach
    void tearDown() {
        portsList=portsListEmpty=null;
        p1=p2=p3=null;

        shipsList=shipsListEmpty=null;
        s1=s2=s3=null;

        containersList=containersListEmpty=null;
        c1=c2=c3=null;

        palletsList=palletsListEmpty=null;
        pl1=pl2=pl3=null;
    }

    @Test
    void addingElementsToEmptyList(){
        assertEquals(0, palletsListEmpty.size());
        palletsListEmpty.addElement(pl2);
        assertEquals(1, palletsListEmpty.size());

        assertEquals(0, shipsListEmpty.size());
        shipsListEmpty.addElement(s2);
        assertEquals(1, shipsListEmpty.size());
    }

    @Test
    void addingElementsToListWithElementsInIt(){
        assertEquals(1, containersList.size());
        containersList.addElement(c2);
        assertEquals(2, containersList.size());

        assertEquals(2, portsList.size());
        portsList.addElement(p3);
        assertEquals(3, portsList.size());
    }



}