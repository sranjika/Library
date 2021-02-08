package com.libraryManagementSystem.beans;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrarianTest {

    @Test
    public void getName() throws Exception
    {

        Librarian lib=new Librarian("sranjika",1);
        assertEquals("sranjika", lib.getName() );

    }

    @Test
    public void getId() throws Exception
    {
        Librarian lib=new Librarian("sranjika",1);
        assertEquals(1, lib.getId() );
    }
}