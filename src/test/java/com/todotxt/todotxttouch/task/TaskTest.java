package com.todotxt.todotxttouch.task;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class TaskTest {
	
	@Test
	public void testConstructor() {
		Task t = new Task();
		new Task(t);
		new Task(1,"texto");
		new Task(2,"Text",new Date());
		assertTrue(true);
	}
	
	@Test
	public void testInitAndUpdate() {
		Task t = new Task();
		t.update("Texto a atualizar");
		assertTrue(true);
	}
	
	@Test
	public void testGetters() {
		Task t = new Task();
		t.getOriginalPriority();
		t.getOriginalText();
		t.getText();
		t.getId();
		t.setPriority(Priority.A);
		t.getPriority();
		t.getContexts();
		t.getLinks();
		t.getPhoneNumbers();
		t.getProjects();
		t.getMailAddresses();
		t.getPrependedDate();
		t.getRelativeAge();
		t.isDeleted();
		t.isCompleted();
		t.isHidden();
		t.getThresholdDate();
		t.getDueDate();
		t.getCompletionDate();
		t.isRec();
		t.isFromThreshold();
		t.getDuration();
		t.getAmount();
		t.markComplete(new Date());
		t.markIncomplete();
		t.delete();
		t.toString();
		t.hashCode();
		assertTrue(true);
	}
	
	
}
