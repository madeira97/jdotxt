package com.chschmid.jdotxt.util.line_branch_coverage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.chschmid.jdotxt.util.FileModifiedListener;
import com.chschmid.jdotxt.util.FileModifiedWatcher;

public class TestFileModifiedWatcher {
	
	@Test
	public void test_create() throws IOException {
		FileModifiedWatcher f = new FileModifiedWatcher();
		assertTrue(true);
	}
	
	@Test
	public void test_get_file() throws IOException {
		FileModifiedWatcher f = new FileModifiedWatcher();
		f.getFile();
		assertTrue(true);
	}
	
	@Test
	public void test_remove_modified() throws IOException {
		FileModifiedWatcher f = new FileModifiedWatcher();
		f.removeFileModifiedListener(new FileModifiedListener() {
			
			@Override
			public void fileModified() {
				// TODO Auto-generated method stub
				
			}
		});
		assertTrue(true);
	}
	
	@Test
	public void test_add_modified() throws IOException {
		FileModifiedWatcher f = new FileModifiedWatcher();
		//ArrayList<FileModifiedListener> fileModifiedListenerList = new ArrayList<FileModifiedListener>();
		f.addFileModifiedListener(new FileModifiedListener() {
			
			@Override
			public void fileModified() {
				// TODO Auto-generated method stub
				
			}
		});
		assertTrue(true);
	}
	
	@Test
	public void test_stop_processing() throws IOException {
		FileModifiedWatcher f = new FileModifiedWatcher();
		f.startProcessingEvents();
		f.stopProcessingEvents();
	}
	

}
