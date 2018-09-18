package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkQueueTestSuite {
    @Test
    public void shouldNotifyMentorAboutNewTaskTOCHeck() {
        HomeworkQueue grupaMacka = new HomeworkMaciek();
        HomeworkQueue grupaZbycha = new HomeworkZbych();
        HomeworkQueue grupaPawla = new HomeworkPawel();

        Mentor pawel = new Mentor("Pawel");
        Mentor maciek = new Mentor("Maciek");
        Mentor zbych = new Mentor("Zbyszek");

        grupaPawla.registerObserver(pawel);
        grupaMacka.registerObserver(maciek);
        grupaZbycha.registerObserver(zbych);

        grupaMacka.buildTheQueue(new Exercise("Java, marzec","20.4", "Ewa"));
        grupaPawla.buildTheQueue(new Exercise("Java, maj","24.4", "Najlepszy student"));
        grupaZbycha.buildTheQueue(new Exercise("Frontend, czerwiec","9.1", "Magda"));
        grupaPawla.buildTheQueue(new Exercise("Java, wrzesien","2.1", "Przemek"));
        grupaMacka.buildTheQueue(new Exercise("Java, marzec","20.5", "Ewa"));

        assertEquals(2, pawel.getCount());
        assertEquals(2, maciek.getCount());
        assertEquals(1, zbych.getCount());
    }
}
