package com.example3;

import java.util.Arrays;

public class Supplier {
		private int sid;
		private String sname;
		private long mobileNo;
		private Item[] item;
		public Supplier() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Supplier(int sid, String sname, long mobileNo, Item[] item) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.mobileNo = mobileNo;
			this.item = item;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		public Item[] getItem() {
			return item;
		}
		public void setItem(Item[] item) {
			this.item = item;
		}
		@Override
		public String toString() {
			return "Supplier [sid=" + sid + ", sname=" + sname + ", mobileNo=" + mobileNo + ", item="
					+ Arrays.toString(item) + "]";
		}
		
		
		
		
}
