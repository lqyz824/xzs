package com.mindskip.xzs.service;

import com.mindskip.xzs.domain.Question;
import com.mindskip.xzs.viewmodel.admin.question.QuestionEditRequestVM;
import com.mindskip.xzs.viewmodel.admin.question.QuestionPageRequestVM;
import com.github.pagehelper.PageInfo;

import java.util.List;


//此处QuestionService接口继承了BaseService接口，可以直接使用BaseService的方法。
//BaseServiceDao接口中定义了一些通用的方法，比如save、delete、update等。
//所以这个类也是执行数据库操作的地方。比如save、delete、update等。
//这些接口在具体的实现类中实现。
public interface QuestionService extends BaseService<Question> {

    //pageinfo处理问题的分页，返回分页信息。
    PageInfo<Question> page(QuestionPageRequestVM requestVM);

    Question insertFullQuestion(QuestionEditRequestVM model, Integer userId);

    Question updateFullQuestion(QuestionEditRequestVM model);

    QuestionEditRequestVM getQuestionEditRequestVM(Integer questionId);

    QuestionEditRequestVM getQuestionEditRequestVM(Question question);

    Integer selectAllCount();

    List<Integer> selectMothCount();
}
