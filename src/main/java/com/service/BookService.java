package com.service;

import com.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 新增
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 根据id修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();

}
