package com.sz.tencent.common;

import java.util.List;

/**
 * 功能描述： 统一分页类；
 *
 * @author Tony.Min
 * @date 2019/10/25 9:13
 */
public class PageBean<T> {

    private long total;    //总共 有多少行数据？
    private List<T> rows;  //当前页面的数据；
    private int pageSize = 3;   //每页多少行？
    private int pagesTotal;  //总共 有多少页?
    private int pageIndex = 1;    //当前 第几页？

    public PageBean() {
    }

    public PageBean(long total, List<T> rows, int pageSize, int pagesTotal, int pageIndex) {
        this.total = total;
        this.rows = rows;
        this.pageSize = pageSize;
        this.pagesTotal = pagesTotal;
        this.pageIndex = pageIndex;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPagesTotal() {
        return pagesTotal;
    }

    public void setPagesTotal(int pagesTotal) {
        this.pagesTotal = pagesTotal;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", rows=" + rows +
                ", pageSize=" + pageSize +
                ", pagesTotal=" + pagesTotal +
                ", pageIndex=" + pageIndex +
                '}';
    }
}
