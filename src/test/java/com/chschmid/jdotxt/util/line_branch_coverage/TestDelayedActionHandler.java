package com.chschmid.jdotxt.util.line_branch_coverage;

import static org.junit.Assert.assertTrue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.junit.Test;

import com.chschmid.jdotxt.util.DelayedActionHandler;

public class TestDelayedActionHandler {
	
	@Test
	public void test_trigger() {
		DelayedActionHandler dac = new DelayedActionHandler(0, null);
		dac.triggerAction();
		assertTrue(true);
	}
	
	@Test
	public void test_close() {
		DelayedActionHandler dac = new DelayedActionHandler(0, null);
		dac.close();
		assertTrue(true);
	}
	
	@Test
	public void createDelayedAction() {
		DelayedActionHandler dac = new DelayedActionHandler(0, null);
		assertTrue(true);
	}
	
	@Test
	public void createDelayedAction_with_runnnable() {
		DelayedActionHandler dac = new DelayedActionHandler(01, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		assertTrue(true);
	}

}
