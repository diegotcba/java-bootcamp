package com.topic3.practice3;

import java.util.HashMap;

public class MiniApplication {

	private String title;
	private HashMap<String, String> recentList=null;
	private int sizeRecent;

	public MiniApplication(String title, int sizeRecentList) {
		// TODO Auto-generated constructor stub
		this.setTitle(title);
		this.sizeRecent=sizeRecentList;
		recentList=new HashMap<String, String>();
	}

	public Object getRecentList() {
		// TODO Auto-generated method stub
		return recentList;
	}

	public void openFile(String fileName) {
		// TODO Auto-generated method stub
		if (recentList.containsValue(fileName))
		{		
			for (int i=getRecentListPosition(fileName); i>=1; i--)
			{
				if (i==1)
				{
					recentList.replace(String.valueOf(i), fileName);
				}
				else
				{
					recentList.replace(String.valueOf(i), recentList.get(String.valueOf(i-1)));
				}
			}
		}
		else
		{
			if (recentList.size()<sizeRecent)
			{
				String index=String.valueOf(recentList.size()+1);
				recentList.put(index, fileName);
			}
			else
			{
				recentList.put("5", fileName);
			}
		}
		
	}
	

	public int getRecentListSize() {
		// TODO Auto-generated method stub
		return recentList.size();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFileName(int position) {
		// TODO Auto-generated method stub
		
		return recentList.get(String.valueOf(position));
	}

	public int getRecentListPosition(String fileName) {
		// TODO Auto-generated method stub
		int aux=0;
		for (int i=1; i<=recentList.size(); i++)
		{
			if (recentList.get(String.valueOf(i)).equals(fileName))
			{
				aux=i;
			}
		}
		
		return aux;
	}
	

}
