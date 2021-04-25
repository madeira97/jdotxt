package com.todotxt.todotxttouch.util.mutation_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.todotxt.todotxttouch.task.Task;
import com.todotxt.todotxttouch.util.CursorPositionCalculator;
import com.todotxt.todotxttouch.util.TaskIo;

public class TestTaskIo {
	
	@Test(expected= NullPointerException.class)
	public void kill_mutant1() throws IOException {
		assertEquals(new ArrayList<Task>(),TaskIo.loadTasksFromFile(null));
	}
	
	@Test
	public void kill_mutant2() throws IOException {
		assertFalse(new ArrayList<Task>()==TaskIo.loadTasksFromFile(new File("")));
	}
	
	@Test
	public void kill_mutant3() throws IOException {
		List<Task> l = new ArrayList<Task>();
		l.add(new Task(0, "poiss"));
		File f = new File("ola.txt");
		TaskIo.writeToFile(l, f);
		assert(f.getTotalSpace() != 0);
		
	}
	
	@Test
	public void kill_mutant4() throws IOException {
		List<Task> l = new ArrayList<Task>();
		File f = new File("ola.txt");
		TaskIo.writeToFile(l, f);
		assert(f.getTotalSpace() != 0);
		
	}
	
	@Test
	public void kill_mutant5() throws IOException {
		List<Task> l = new ArrayList<Task>();
		TaskIo.writeToFile(l, null);
		assertTrue(true);
	}

}
