package com.pjh.mydb.common;

/**
 * @author Joseph Peng
 * @date 2022/7/27 22:50
 */
public class Error {

    // TM
    public static final Exception BadTIDFileException = new RuntimeException("TID 文件异常！");

    // common
    public static final Exception FileExistsException = new RuntimeException("TID 文件已存在！");
    public static final Exception FileCannotRWException = new RuntimeException("TID 文件无法读写！");
    public static final Exception FileNotExistsException = new RuntimeException("TID 文件不存在!");
    public static final Exception CacheFullException  = new RuntimeException("缓存已满！");

    // DM
    public static final Exception MemTooSmallException   = new RuntimeException("缓存初始设置太小！");
    public static final Exception BadLogFileException = new RuntimeException("日志文件损坏！");
    public static final Exception DataTooLargeException = new RuntimeException("OOM，数据太大！");
    public static final Exception DatabaseBusyException = new RuntimeException("数据库繁忙！");


}
