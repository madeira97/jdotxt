package com.todotxt.todotxttouch.util.mutation_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import com.todotxt.todotxttouch.task.Priority;
import com.todotxt.todotxttouch.task.Task;
	
public class TestTask {
	
	@Test
	public void test_branch1(){
		Task t = new Task();
		t.update("Nova Tarefa");
		t.getOriginalPriority();
		assertTrue(t.getText().equals("Nova Tarefa"));
	}
	
	@Test
	public void mutation_kill2() {
		Task t = new Task();
		t.getPriority();
		assertEquals(t.getContexts(),new ArrayList<>());
		assertEquals(t.getOriginalPriority(),Priority.NONE);
	}
	
	@Test
	public void mutation_kill3() {
		Task t = new Task();
		Task t2 = new Task();
		assertEquals(t.hashCode(),t2.hashCode());
		assertTrue(t.equals(t2));
		assertTrue(t.inScreenFormat() != null);
	}
	
	@Test
	public void mutation_killEquals() {
		Task t = new Task();
		//Task t2 = new Task();
		assertFalse(t.equals(null));
		assertTrue(t.equals(t));
		assertFalse(t.equals(new ArrayList<Integer>()));
		//assertFalse(t.equals(t2));
	}
	
	@Test
	public void mutation_kill4() {
		Task t = new Task();
		t.setPriority(Priority.A);
		assertEquals(Priority.A,t.getPriority());
		
	}
	
	
	@Test
	public void mutationKill_TaskPriority() {
		Priority p = Priority.A;
		p.getCode();
		p.inListFormat();
		Priority.range(Priority.A, Priority.Z);
		Priority.toPriority("B");
		assertEquals(Priority.toPriority("A"),Priority.A);
	}

}
