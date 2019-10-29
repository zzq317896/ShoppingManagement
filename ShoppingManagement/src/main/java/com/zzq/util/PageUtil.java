package com.zzq.util;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PageUtil<T> implements Serializable{
		private int currentPageNo = 1;
		private int totalCount = 0;
		private int pageSize=0;
		private int totalPageCount = 1;
		private List<T> currentInfo;
		
		public int getCurrentPageNo() {
			return currentPageNo;
		}
		public void setCurrentPageNo(int currentPageNo) {
			if(currentPageNo > 0){
				this.currentPageNo = currentPageNo;
			}
		}

		public int getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(int totalCount) {
			if(totalCount > 0){
				this.totalCount = totalCount;
			}
		}
		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			if(pageSize > 0){
				this.pageSize = pageSize;
			}
		}

		public int getTotalPageCount() {
			return totalPageCount;
		}

		public void setTotalPageCount(int totalPageCount) {
			this.totalPageCount = totalPageCount;
		}
		
		public List<T> getCurrentInfo() {
			return currentInfo;
		}
		public void setCurrentInfo(List<T> currentInfo) {
			this.currentInfo = currentInfo;
		}
		
}
