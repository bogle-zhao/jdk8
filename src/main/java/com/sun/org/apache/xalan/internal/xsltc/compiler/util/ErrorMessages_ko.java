/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2007, 2015, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 *  版权所有2001-2004 Apache软件基金会。
 * 
 *  根据Apache许可证2.0版("许可证")授权;您不能使用此文件,除非符合许可证。您可以通过获取许可证的副本
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  除非适用法律要求或书面同意,否则根据许可证分发的软件按"原样"分发,不附带任何明示或暗示的担保或条件。请参阅管理许可证下的权限和限制的特定语言的许可证。
 * 
 */

package com.sun.org.apache.xalan.internal.xsltc.compiler.util;

import java.util.ListResourceBundle;

/**
/* <p>
/* 
 * @author Morten Jorgensen
 */
public class ErrorMessages_ko extends ListResourceBundle {

/*
 * XSLTC compile-time error messages.
 *
 * General notes to translators and definitions:
 *
 *   1) XSLTC is the name of the product.  It is an acronym for "XSLT Compiler".
 *      XSLT is an acronym for "XML Stylesheet Language: Transformations".
 *
 *   2) A stylesheet is a description of how to transform an input XML document
 *      into a resultant XML document (or HTML document or text).  The
 *      stylesheet itself is described in the form of an XML document.
 *
 *   3) A template is a component of a stylesheet that is used to match a
 *      particular portion of an input document and specifies the form of the
 *      corresponding portion of the output document.
 *
 *   4) An axis is a particular "dimension" in a tree representation of an XML
 *      document; the nodes in the tree are divided along different axes.
 *      Traversing the "child" axis, for instance, means that the program
 *      would visit each child of a particular node; traversing the "descendant"
 *      axis means that the program would visit the child nodes of a particular
 *      node, their children, and so on until the leaf nodes of the tree are
 *      reached.
 *
 *   5) An iterator is an object that traverses nodes in a tree along a
 *      particular axis, one at a time.
 *
 *   6) An element is a mark-up tag in an XML document; an attribute is a
 *      modifier on the tag.  For example, in <elem attr='val' attr2='val2'>
 *      "elem" is an element name, "attr" and "attr2" are attribute names with
 *      the values "val" and "val2", respectively.
 *
 *   7) A namespace declaration is a special attribute that is used to associate
 *      a prefix with a URI (the namespace).  The meanings of element names and
 *      attribute names that use that prefix are defined with respect to that
 *      namespace.
 *
 *   8) DOM is an acronym for Document Object Model.  It is a tree
 *      representation of an XML document.
 *
 *      SAX is an acronym for the Simple API for XML processing.  It is an API
 *      used inform an XML processor (in this case XSLTC) of the structure and
 *      content of an XML document.
 *
 *      Input to the stylesheet processor can come from an XML parser in the
 *      form of a DOM tree or through the SAX API.
 *
 *   9) DTD is a document type declaration.  It is a way of specifying the
 *      grammar for an XML file, the names and types of elements, attributes,
 *      etc.
 *
 *  10) XPath is a specification that describes a notation for identifying
 *      nodes in a tree-structured representation of an XML document.  An
 *      instance of that notation is referred to as an XPath expression.
 *
 *  11) Translet is an invented term that refers to the class file that contains
 *      the compiled form of a stylesheet.
 * <p>
 *  XSLTC编译时错误消息。
 * 
 *  翻译者和定义的一般注释：
 * 
 *  1)XSLTC是产品的名称。它是"XSLT编译器"的缩写。 XSLT是"XML Stylesheet Language：Transformations"的缩写。
 * 
 *  2)样式表是如何将输入XML文档转换为结果XML文档(或HTML文档或文本)的描述。样式表本身以XML文档的形式描述。
 * 
 *  3)模板是用于匹配输入文档的特定部分并指定输出文档的对应部分的形式的样式表的组件。
 * 
 * 4)轴是XML文档的树表示中的特定"维度";树中的节点沿不同的轴被划分。
 * 例如,遍历"子"轴意味着程序将访问特定节点的每个子节点;遍历"后代"轴意味着程序将访问特定节点的子节点,它们的子节点,等等,直到到达树的叶节点。
 * 
 *  5)迭代器是沿着特定轴遍历树中的节点的对象,一次一个。
 * 
 *  6)元素是XML文档中的标记标记;属性是标记上的修饰符。
 * 例如,在<elem attr ='val'attr2 ='val2'>"elem"是元素名称,"attr"和"attr2"分别是具有值"val"和"val2"的属性名称。
 * 
 *  7)命名空间声明是用于将前缀与URI(命名空间)相关联的特殊属性。使用该前缀的元素名称和属性名称的含义是相对于该命名空间定义的。
 * 
 *  8)DOM是文档对象模型的首字母缩写。它是XML文档的树表示。
 * 
 *  SAX是Simple API for XML处理的首字母缩略词。它是一个API,用于通知XML处理器(在本例中为XSLTC)XML文档的结构和内容。
 * 
 *  对样式表处理器的输入可以来自XML解析器,以DOM树的形式或通过SAX API。
 * 
 * 9)DTD是一个文档类型声明。它是一种指定XML文件的语法,元素的名称和类型,属性等的方法。
 * 
 *  10)XPath是描述用于标识XML文档的树结构表示中的节点的符号的规范。该符号的实例称为XPath表达式。
 * 
 *  11)Translet是一个发明的术语,它引用包含样式表的编译形式的类文件。
 * 
 */

    // These message should be read from a locale-specific resource bundle
    /** Get the lookup table for error messages.
     *
     * <p>
     * 
     * @return The message lookup table.
     */
    public Object[][] getContents()
    {
      return new Object[][] {
        {ErrorMsg.MULTIPLE_STYLESHEET_ERR,
        "\uB3D9\uC77C\uD55C \uD30C\uC77C\uC5D0 \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uAC00 \uB450 \uAC1C \uC774\uC0C1 \uC815\uC758\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a
         * template.  The same name was used on two different templates in the
         * same stylesheet.
         * <p>
         *  翻译者注意：替换文本是模板的名称。在同一样式表中的两个不同模板上使用了相同的名称。
         * 
         */
        {ErrorMsg.TEMPLATE_REDEF_ERR,
        "\uC774 \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uC5D0\uB294 ''{0}'' \uD15C\uD50C\uB9AC\uD2B8\uAC00 \uC774\uBBF8 \uC815\uC758\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},


        /*
         * Note to translators:  The substitution text is the name of a
         * template.  A reference to the template name was encountered, but the
         * template is undefined.
         * <p>
         *  翻译者注意：替换文本是模板的名称。遇到对模板名称的引用,但模板未定义。
         * 
         */
        {ErrorMsg.TEMPLATE_UNDEF_ERR,
        "\uC774 \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uC5D0\uB294 ''{0}'' \uD15C\uD50C\uB9AC\uD2B8\uAC00 \uC815\uC758\uB418\uC9C0 \uC54A\uC558\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a variable
         * that was defined more than once.
         * <p>
         *  对翻译者的注意：替换文本是被不止一次定义的变量的名称。
         * 
         */
        {ErrorMsg.VARIABLE_REDEF_ERR,
        "\uB3D9\uC77C\uD55C \uBC94\uC704\uC5D0\uC11C ''{0}'' \uBCC0\uC218\uAC00 \uC5EC\uB7EC \uAC1C \uC815\uC758\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a variable
         * or parameter.  A reference to the variable or parameter was found,
         * but it was never defined.
         * <p>
         *  翻译者注意：替换文本是变量或参数的名称。发现对变量或参数的引用,但它从未定义。
         * 
         */
        {ErrorMsg.VARIABLE_UNDEF_ERR,
        "\uBCC0\uC218 \uB610\uB294 \uB9E4\uAC1C\uBCC0\uC218 ''{0}''\uC774(\uAC00) \uC815\uC758\uB418\uC9C0 \uC54A\uC558\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The word "class" here refers to a Java class.
         * Processing the stylesheet required a class to be loaded, but it could
         * not be found.  The substitution text is the name of the class.
         * <p>
         *  注意翻译者：这里的"类"这个词指的是Java类。处理样式表需要加载一个类,但无法找到它。替换文本是类的名称。
         * 
         */
        {ErrorMsg.CLASS_NOT_FOUND_ERR,
        "''{0}'' \uD074\uB798\uC2A4\uB97C \uCC3E\uC744 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The word "method" here refers to a Java method.
         * Processing the stylesheet required a reference to the method named by
         * the substitution text, but it could not be found.  "public" is the
         * Java keyword.
         * <p>
         *  注意翻译者：这里的"方法"一词是指Java方法。处理样式表需要对替换文本命名的方法的引用,但找不到它。 "public"是Java关键字。
         * 
         */
        {ErrorMsg.METHOD_NOT_FOUND_ERR,
        "\uC678\uBD80 \uBA54\uC18C\uB4DC ''{0}''\uC744(\uB97C) \uCC3E\uC744 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4. \uC774 \uBA54\uC18C\uB4DC\uB294 public\uC774\uC5B4\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  The word "method" here refers to a Java method.
         * Processing the stylesheet required a reference to the method named by
         * the substitution text, but no method with the required types of
         * arguments or return type could be found.
         * <p>
         * 注意翻译者：这里的"方法"一词是指Java方法。处理样式表需要对替换文本命名的方法的引用,但是没有找到具有所需类型的参数或返回类型的方法。
         * 
         */
        {ErrorMsg.ARGUMENT_CONVERSION_ERR,
        "''{0}'' \uBA54\uC18C\uB4DC\uC5D0 \uB300\uD55C \uD638\uCD9C\uC5D0\uC11C \uC778\uC218/\uBC18\uD658 \uC720\uD615\uC744 \uBCC0\uD658\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The file or URI named in the substitution text
         * is missing.
         * <p>
         *  翻译者注意：替换文本中命名的文件或URI丢失。
         * 
         */
        {ErrorMsg.FILE_NOT_FOUND_ERR,
        "\uD30C\uC77C \uB610\uB294 URI ''{0}''\uC744(\uB97C) \uCC3E\uC744 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message is displayed when the URI
         * mentioned in the substitution text is not well-formed syntactically.
         * <p>
         *  注意翻译者：当替换文本中提到的URI语法不正确时,将显示此消息。
         * 
         */
        {ErrorMsg.INVALID_URI_ERR,
        "URI ''{0}''\uC774(\uAC00) \uBD80\uC801\uD569\uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  The file or URI named in the substitution text
         * exists but could not be opened.
         * <p>
         *  翻译者注意：替换文本中命名的文件或URI存在,但无法打开。
         * 
         */
        {ErrorMsg.FILE_ACCESS_ERR,
        "\uD30C\uC77C \uB610\uB294 URI ''{0}''\uC744(\uB97C) \uC5F4 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators: <xsl:stylesheet> and <xsl:transform> are
         * keywords that should not be translated.
         * <p>
         *  注意翻译者：<xsl：stylesheet>和<xsl：transform>是不应翻译的关键字。
         * 
         */
        {ErrorMsg.MISSING_ROOT_ERR,
        "<xsl:stylesheet> \uB610\uB294 <xsl:transform> \uC694\uC18C\uAC00 \uD544\uC694\uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  The stylesheet contained a reference to a
         * namespace prefix that was undefined.  The value of the substitution
         * text is the name of the prefix.
         * <p>
         *  翻译者注意：样式表包含对未定义的命名空间前缀的引用。替换文本的值是前缀的名称。
         * 
         */
        {ErrorMsg.NAMESPACE_UNDEF_ERR,
        "\uB124\uC784\uC2A4\uD398\uC774\uC2A4 \uC811\uB450\uC5B4 ''{0}''\uC774(\uAC00) \uC120\uC5B8\uB418\uC9C0 \uC54A\uC558\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The Java function named in the stylesheet could
         * not be found.
         * <p>
         *  翻译者注意：找不到样式表中命名的Java函数。
         * 
         */
        {ErrorMsg.FUNCTION_RESOLVE_ERR,
        "''{0}'' \uD568\uC218\uC5D0 \uB300\uD55C \uD638\uCD9C\uC744 \uBD84\uC11D\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a
         * function.  A literal string here means a constant string value.
         * <p>
         *  注意翻译者：替换文本是函数的名称。这里的文字字符串意味着一个常量字符串值。
         * 
         */
        {ErrorMsg.NEED_LITERAL_ERR,
        "''{0}''\uC5D0 \uB300\uD55C \uC778\uC218\uB294 \uB9AC\uD130\uB7F4 \uBB38\uC790\uC5F4\uC774\uC5B4\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message indicates there was a syntactic
         * error in the form of an XPath expression.  The substitution text is
         * the expression.
         * <p>
         *  注意翻译者：此消息指示在XPath表达式的形式中存在句法错误。替换文本是表达式。
         * 
         */
        {ErrorMsg.XPATH_PARSER_ERR,
        "XPath \uD45C\uD604\uC2DD ''{0}''\uC758 \uAD6C\uBB38\uC744 \uBD84\uC11D\uD558\uB294 \uC911 \uC624\uB958\uAC00 \uBC1C\uC0DD\uD588\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  An element in the stylesheet requires a
         * particular attribute named by the substitution text, but that
         * attribute was not specified in the stylesheet.
         * <p>
         *  翻译者注意：样式表中的元素需要由替换文本命名的特定属性,但该属性未在样式表中指定。
         * 
         */
        {ErrorMsg.REQUIRED_ATTR_ERR,
        "\uD544\uC218 \uC18D\uC131 ''{0}''\uC774(\uAC00) \uB204\uB77D\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message indicates that a character not
         * permitted in an XPath expression was encountered.  The substitution
         * text is the offending character.
         * <p>
         * 翻译者注意：此消息指示遇到XPath表达式中不允许的字符。替换文本是令人讨厌的字符。
         * 
         */
        {ErrorMsg.ILLEGAL_CHAR_ERR,
        "XPath \uD45C\uD604\uC2DD\uC5D0 \uC798\uBABB\uB41C \uBB38\uC790 ''{0}''\uC774(\uAC00) \uC788\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  A processing instruction is a mark-up item in
         * an XML document that request some behaviour of an XML processor.  The
         * form of the name of was invalid in this case, and the substitution
         * text is the name.
         * <p>
         *  对翻译者的注意：处理指令是XML文档中的标记项,其请求XML处理器的某些行为。在这种情况下,名称的形式无效,替换文本是名称。
         * 
         */
        {ErrorMsg.ILLEGAL_PI_ERR,
        "''{0}''\uC740(\uB294) \uBA85\uB839 \uCC98\uB9AC\uC5D0 \uC798\uBABB\uB41C \uC774\uB984\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message is reported if the stylesheet
         * being processed attempted to construct an XML document with an
         * attribute in a place other than on an element.  The substitution text
         * specifies the name of the attribute.
         * <p>
         *  翻译者注意：如果正在处理的样式表试图在一个元素之外的地方构造一个具有属性的XML文档,则会报告此消息。替换文本指定属性的名称。
         * 
         */
        {ErrorMsg.STRAY_ATTRIBUTE_ERR,
        "''{0}'' \uC18D\uC131\uC774 \uC694\uC18C\uC5D0 \uD3EC\uD568\uB418\uC5B4 \uC788\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  An attribute that wasn't recognized was
         * specified on an element in the stylesheet.  The attribute is named
         * by the substitution
         * text.
         * <p>
         *  翻译者注意：在样式表中的元素上指定了无法识别的属性。属性由替换文本命名。
         * 
         */
        {ErrorMsg.ILLEGAL_ATTRIBUTE_ERR,
        "''{0}''\uC740(\uB294) \uC798\uBABB\uB41C \uC18D\uC131\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  "import" and "include" are keywords that should
         * not be translated.  This messages indicates that the stylesheet
         * named in the substitution text imported or included itself either
         * directly or indirectly.
         * <p>
         *  注意翻译者："import"和"include"是不应翻译的关键字。此消息表示在替换文本中命名的样式表直接或间接导入或包含自身。
         * 
         */
        {ErrorMsg.CIRCULAR_INCLUDE_ERR,
        "\uC21C\uD658 import/include\uC785\uB2C8\uB2E4. ''{0}'' \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uAC00 \uC774\uBBF8 \uB85C\uB4DC\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  A result-tree fragment is a portion of a
         * resulting XML document represented as a tree.  "<xsl:sort>" is a
         * keyword and should not be translated.
         * <p>
         *  对翻译者的注意：结果树片段是作为树表示的结果XML文档的一部分。 "<xsl：sort>"是关键字,不应翻译。
         * 
         */
        {ErrorMsg.RESULT_TREE_SORT_ERR,
        "Result-tree \uBD80\uBD84\uC744 \uC815\uB82C\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4(<xsl:sort> \uC694\uC18C\uAC00 \uBB34\uC2DC\uB428). \uACB0\uACFC \uD2B8\uB9AC\uB97C \uC0DD\uC131\uD560 \uB54C\uB294 \uB178\uB4DC\uB97C \uC815\uB82C\uD574\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  A name can be given to a particular style to be
         * used to format decimal values.  The substitution text gives the name
         * of such a style for which more than one declaration was encountered.
         * <p>
         *  对翻译者的注意：可以给一个名称赋予用于格式十进制值的特定样式。替换文本给出了遇到多个声明的样式的名称。
         * 
         */
        {ErrorMsg.SYMBOLS_REDEF_ERR,
        "\uC2ED\uC9C4\uC218 \uD615\uC2DD ''{0}''\uC774(\uAC00) \uC774\uBBF8 \uC815\uC758\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The stylesheet version named in the
         * substitution text is not supported.
         * <p>
         *  注意翻译者：不支持在替换文本中命名的样式表版本。
         * 
         */
        {ErrorMsg.XSL_VERSION_ERR,
        "XSLTC\uB294 XSL \uBC84\uC804 ''{0}''\uC744(\uB97C) \uC9C0\uC6D0\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The definitions of one or more variables or
         * parameters depend on one another.
         * <p>
         * 翻译者注意：一个或多个变量或参数的定义取决于彼此。
         * 
         */
        {ErrorMsg.CIRCULAR_VARIABLE_ERR,
        "''{0}''\uC5D0 \uC21C\uD658 \uBCC0\uC218/\uB9E4\uAC1C\uBCC0\uC218 \uCC38\uC870\uAC00 \uC788\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The operator in an expresion with two operands was
         * not recognized.
         * <p>
         *  对翻译者的注意：无法识别具有两个操作数的表达式中的运算符。
         * 
         */
        {ErrorMsg.ILLEGAL_BINARY_OP_ERR,
        "\uC774\uC9C4 \uD45C\uD604\uC2DD\uC5D0 \uB300\uD574 \uC54C \uC218 \uC5C6\uB294 \uC5F0\uC0B0\uC790\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message is produced if a reference to a
         * function has too many or too few arguments.
         * <p>
         *  对翻译者的注意：如果对一个函数的引用具有太多或太少的参数,则会产生此消息。
         * 
         */
        {ErrorMsg.ILLEGAL_ARG_ERR,
        "\uD568\uC218 \uD638\uCD9C\uC5D0 \uB300\uD55C \uC778\uC218\uAC00 \uC798\uBABB\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "document()" is the name of function and must
         * not be translated.  A node-set is a set of the nodes in the tree
         * representation of an XML document.
         * <p>
         *  注意翻译者："document()"是函数的名称,不能翻译。节点集是XML文档的树表示中的一组节点。
         * 
         */
        {ErrorMsg.DOCUMENT_ARG_ERR,
        "document() \uD568\uC218\uC5D0 \uB300\uD55C \uB450\uBC88\uC9F8 \uC778\uC218\uB294 node-set\uC5EC\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  "<xsl:when>" and "<xsl:choose>" are keywords
         * and should not be translated.  This message describes a syntax error
         * in the stylesheet.
         * <p>
         *  注意翻译者："<xsl：when>"和"<xsl：choose>"是关键字,不应翻译。此消息描述样式表中的语法错误。
         * 
         */
        {ErrorMsg.MISSING_WHEN_ERR,
        "<xsl:choose>\uC5D0\uB294 <xsl:when> \uC694\uC18C\uAC00 \uD558\uB098 \uC774\uC0C1 \uD544\uC694\uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  "<xsl:otherwise>" and "<xsl:choose>" are
         * keywords and should not be translated.  This message describes a
         * syntax error in the stylesheet.
         * <p>
         *  注意翻译者："<xsl：other>"和"<xsl：choose>"是关键字,不应翻译。此消息描述样式表中的语法错误。
         * 
         */
        {ErrorMsg.MULTIPLE_OTHERWISE_ERR,
        "<xsl:choose>\uC5D0\uC11C\uB294 <xsl:otherwise> \uC694\uC18C\uAC00 \uD558\uB098\uB9CC \uD5C8\uC6A9\uB429\uB2C8\uB2E4."},

        /*
         * Note to translators:  "<xsl:otherwise>" and "<xsl:choose>" are
         * keywords and should not be translated.  This message describes a
         * syntax error in the stylesheet.
         * <p>
         *  注意翻译者："<xsl：other>"和"<xsl：choose>"是关键字,不应翻译。此消息描述样式表中的语法错误。
         * 
         */
        {ErrorMsg.STRAY_OTHERWISE_ERR,
        "<xsl:otherwise>\uB294 <xsl:choose>\uC5D0\uC11C\uB9CC \uC0AC\uC6A9\uD560 \uC218 \uC788\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "<xsl:when>" and "<xsl:choose>" are keywords
         * and should not be translated.  This message describes a syntax error
         * in the stylesheet.
         * <p>
         *  注意翻译者："<xsl：when>"和"<xsl：choose>"是关键字,不应翻译。此消息描述样式表中的语法错误。
         * 
         */
        {ErrorMsg.STRAY_WHEN_ERR,
        "<xsl:when>\uC740 <xsl:choose>\uC5D0\uC11C\uB9CC \uC0AC\uC6A9\uD560 \uC218 \uC788\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "<xsl:when>", "<xsl:otherwise>" and
         * "<xsl:choose>" are keywords and should not be translated.  This
         * message describes a syntax error in the stylesheet.
         * <p>
         *  注意翻译者："<xsl：when>","<xsl：other>"和"<xsl：choose>"是关键字,不应翻译。此消息描述样式表中的语法错误。
         * 
         */
        {ErrorMsg.WHEN_ELEMENT_ERR,
        "<xsl:choose>\uC5D0\uC11C\uB294 <xsl:when> \uBC0F <xsl:otherwise> \uC694\uC18C\uB9CC \uD5C8\uC6A9\uB429\uB2C8\uB2E4."},

        /*
         * Note to translators:  "<xsl:attribute-set>" and "name" are keywords
         * that should not be translated.
         * <p>
         *  注意翻译者："<xsl：attribute-set>"和"name"是不应翻译的关键字。
         * 
         */
        {ErrorMsg.UNNAMED_ATTRIBSET_ERR,
        "<xsl:attribute-set>\uC5D0 'name' \uC18D\uC131\uC774 \uB204\uB77D\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  An element in the stylesheet contained an
         * element of a type that it was not permitted to contain.
         * <p>
         * 翻译者注意：样式表中的元素包含不允许包含的类型的元素。
         * 
         */
        {ErrorMsg.ILLEGAL_CHILD_ERR,
        "\uD558\uC704 \uC694\uC18C\uAC00 \uC798\uBABB\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The stylesheet tried to create an element with
         * a name that was not a valid XML name.  The substitution text contains
         * the name.
         * <p>
         *  翻译者注意：样式表试图创建一个名称不是有效XML名称的元素。替换文本包含名称。
         * 
         */
        {ErrorMsg.ILLEGAL_ELEM_NAME_ERR,
        "''{0}'' \uC694\uC18C\uB97C \uD638\uCD9C\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The stylesheet tried to create an attribute
         * with a name that was not a valid XML name.  The substitution text
         * contains the name.
         * <p>
         *  翻译者注意：样式表试图创建一个名称不是有效XML名称的属性。替换文本包含名称。
         * 
         */
        {ErrorMsg.ILLEGAL_ATTR_NAME_ERR,
        "''{0}'' \uC18D\uC131\uC744 \uD638\uCD9C\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The children of the outermost element of a
         * stylesheet are referred to as top-level elements.  No text should
         * occur within that outermost element unless it is within a top-level
         * element.  This message indicates that that constraint was violated.
         * "<xsl:stylesheet>" is a keyword that should not be translated.
         * <p>
         *  对翻译者的注意：样式表的最外层元素的子元素被称为顶级元素。除非它在顶层元素中,否则不应在该最外层元素中出现文本。此消息指示违反了该约束。 "<xsl：stylesheet>"是不应翻译的关键字。
         * 
         */
        {ErrorMsg.ILLEGAL_TEXT_NODE_ERR,
        "\uD14D\uC2A4\uD2B8 \uB370\uC774\uD130\uAC00 \uCD5C\uC0C1\uC704 \uB808\uBCA8 <xsl:stylesheet> \uC694\uC18C\uC5D0 \uD3EC\uD568\uB418\uC5B4 \uC788\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  JAXP is an acronym for the Java API for XML
         * Processing.  This message indicates that the XML parser provided to
         * XSLTC to process the XML input document had a configuration problem.
         * <p>
         *  翻译者注意：JAXP是Java API for XML Processing的缩写。此消息表明提供给XSLTC以处理XML输入文档的XML解析器有一个配置问题。
         * 
         */
        {ErrorMsg.SAX_PARSER_CONFIG_ERR,
        "JAXP \uAD6C\uBB38 \uBD84\uC11D\uAE30\uAC00 \uC81C\uB300\uB85C \uAD6C\uC131\uB418\uC9C0 \uC54A\uC558\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text names the internal error
         * encountered.
         * <p>
         *  注意翻译者：替换文本命名遇到的内部错误。
         * 
         */
        {ErrorMsg.INTERNAL_ERR,
        "\uBCF5\uAD6C\uD560 \uC218 \uC5C6\uB294 XSLTC \uB0B4\uBD80 \uC624\uB958: ''{0}''"},

        /*
         * Note to translators:  The stylesheet contained an element that was
         * not recognized as part of the XSL syntax.  The substitution text
         * gives the element name.
         * <p>
         *  对翻译者的注意：样式表包含一个未被识别为XSL语法一部分的元素。替换文本提供元素名称。
         * 
         */
        {ErrorMsg.UNSUPPORTED_XSL_ERR,
        "''{0}''\uC740(\uB294) \uC9C0\uC6D0\uB418\uC9C0 \uC54A\uB294 XSL \uC694\uC18C\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  The stylesheet referred to an extension to the
         * XSL syntax and indicated that it was defined by XSLTC, but XSTLC does
         * not recognized the particular extension named.  The substitution text
         * gives the extension name.
         * <p>
         *  对翻译者的注意：样式表指的是XSL语法的扩展,并指示它是由XSLTC定义的,但XSTLC不识别特定的扩展名。替换文本提供扩展名。
         * 
         */
        {ErrorMsg.UNSUPPORTED_EXT_ERR,
        "''{0}''\uC740(\uB294) \uC54C \uC218 \uC5C6\uB294 XSLTC \uD655\uC7A5\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  The XML document given to XSLTC as a stylesheet
         * was not, in fact, a stylesheet.  XSLTC is able to detect that in this
         * case because the outermost element in the stylesheet has to be
         * declared with respect to the XSL namespace URI, but no declaration
         * for that namespace was seen.
         * <p>
         * 对翻译者的注意：给XSLTC作为样式表的XML文档实际上不是样式表。 XSLTC能够检测到在这种情况下,因为样式表中的最外面的元素必须相对于XSL命名空间URI声明,但没有看到该命名空间的声明。
         * 
         */
        {ErrorMsg.MISSING_XSLT_URI_ERR,
        "\uC785\uB825 \uBB38\uC11C\uB294 \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uAC00 \uC544\uB2D9\uB2C8\uB2E4. XSL \uB124\uC784\uC2A4\uD398\uC774\uC2A4\uAC00 \uB8E8\uD2B8 \uC694\uC18C\uC5D0 \uC120\uC5B8\uB418\uC9C0 \uC54A\uC558\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  XSLTC could not find the stylesheet document
         * with the name specified by the substitution text.
         * <p>
         *  对翻译者的注意：XSLTC找不到具有替换文本指定的名称的样式表文档。
         * 
         */
        {ErrorMsg.MISSING_XSLT_TARGET_ERR,
        "\uC2A4\uD0C0\uC77C\uC2DC\uD2B8 \uB300\uC0C1 ''{0}''\uC744(\uB97C) \uCC3E\uC744 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  access to the stylesheet target is denied
         * <p>
         *  注意翻译者：访问样式表目标被拒绝
         * 
         */
        {ErrorMsg.ACCESSING_XSLT_TARGET_ERR,
        "accessExternalStylesheet \uC18D\uC131\uC73C\uB85C \uC124\uC815\uB41C \uC81C\uD55C\uC73C\uB85C \uC778\uD574 ''{1}'' \uC561\uC138\uC2A4\uAC00 \uD5C8\uC6A9\uB418\uC9C0 \uC54A\uC73C\uBBC0\uB85C \uC2A4\uD0C0\uC77C\uC2DC\uD2B8 \uB300\uC0C1 ''{0}''\uC744(\uB97C) \uC77D\uC744 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message represents an internal error in
         * condition in XSLTC.  The substitution text is the class name in XSLTC
         * that is missing some functionality.
         * <p>
         *  翻译者注意：此消息表示XSLTC中的内部错误。替换文本是XSLTC中缺少某些功能的类名。
         * 
         */
        {ErrorMsg.NOT_IMPLEMENTED_ERR,
        "\uAD6C\uD604\uB418\uC9C0 \uC54A\uC74C: ''{0}''."},

        /*
         * Note to translators:  The XML document given to XSLTC as a stylesheet
         * was not, in fact, a stylesheet.
         * <p>
         *  对翻译者的注意：给XSLTC作为样式表的XML文档实际上不是样式表。
         * 
         */
        {ErrorMsg.NOT_STYLESHEET_ERR,
        "\uC785\uB825 \uBB38\uC11C\uC5D0 XSL \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uAC00 \uD3EC\uD568\uB418\uC5B4 \uC788\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The element named in the substitution text was
         * encountered in the stylesheet but is not recognized.
         * <p>
         *  翻译者注意：替换文本中命名的元素在样式表中遇到,但无法识别。
         * 
         */
        {ErrorMsg.ELEMENT_PARSE_ERR,
        "''{0}'' \uC694\uC18C\uC758 \uAD6C\uBB38\uC744 \uBD84\uC11D\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "use", "<key>", "node", "node-set", "string"
         * and "number" are keywords in this context and should not be
         * translated.  This message indicates that the value of the "use"
         * attribute was not one of the permitted values.
         * <p>
         *  对翻译者的注意："使用","<key>","节点","节点集","字符串"和"数字"是此上下文中的关键字,不应翻译。此消息表明"use"属性的值不是允许的值之一。
         * 
         */
        {ErrorMsg.KEY_USE_ATTR_ERR,
        "<key>\uC758 use \uC18D\uC131\uC740 node, node-set, string \uB610\uB294 number\uC5EC\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  An XML document can specify the version of the
         * XML specification to which it adheres.  This message indicates that
         * the version specified for the output document was not valid.
         * <p>
         *  翻译者注意：XML文档可以指定它所遵循的XML规范的版本。此消息表明为输出文档指定的版本无效。
         * 
         */
        {ErrorMsg.OUTPUT_VERSION_ERR,
        "\uCD9C\uB825 XML \uBB38\uC11C \uBC84\uC804\uC740 1.0\uC774\uC5B4\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  The operator in a comparison operation was
         * not recognized.
         * <p>
         *  对翻译员的注释：无法识别比较操作中的运算符。
         * 
         */
        {ErrorMsg.ILLEGAL_RELAT_OP_ERR,
        "\uAD00\uACC4 \uD45C\uD604\uC2DD\uC5D0 \uB300\uD574 \uC54C \uC218 \uC5C6\uB294 \uC5F0\uC0B0\uC790\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  An attribute set defines as a set of XML
         * attributes that can be added to an element in the output XML document
         * as a group.  This message is reported if the name specified was not
         * used to declare an attribute set.  The substitution text is the name
         * that is in error.
         * <p>
         * 翻译器注意事项：属性集定义为一组XML属性,可以作为组添加到输出XML文档中的元素。如果指定的名称未用于声明属性集,则会报告此消息。替换文本是错误的名称。
         * 
         */
        {ErrorMsg.ATTRIBSET_UNDEF_ERR,
        "\uC874\uC7AC\uD558\uC9C0 \uC54A\uB294 \uC18D\uC131 \uC9D1\uD569 ''{0}''\uC744(\uB97C) \uC0AC\uC6A9\uD558\uB824\uACE0 \uC2DC\uB3C4\uD558\uB294 \uC911\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  The term "attribute value template" is a term
         * defined by XSLT which describes the value of an attribute that is
         * determined by an XPath expression.  The message indicates that the
         * expression was syntactically incorrect; the substitution text
         * contains the expression that was in error.
         * <p>
         *  翻译者注意：术语"属性值模板"是由XSLT定义的术语,用于描述由XPath表达式确定的属性的值。消息指示表达式在语法上不正确;替换文本包含错误的表达式。
         * 
         */
        {ErrorMsg.ATTR_VAL_TEMPLATE_ERR,
        "\uC18D\uC131\uAC12 \uD15C\uD50C\uB9AC\uD2B8 ''{0}''\uC758 \uAD6C\uBB38\uC744 \uBD84\uC11D\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  ???
         * <p>
         *  注意翻译：???
         * 
         */
        {ErrorMsg.UNKNOWN_SIG_TYPE_ERR,
        "''{0}'' \uD074\uB798\uC2A4\uC5D0 \uB300\uD55C \uC11C\uBA85\uC5D0 \uC54C \uC218 \uC5C6\uB294 \uB370\uC774\uD130 \uC720\uD615\uC774 \uC788\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text refers to data types.
         * The message is displayed if a value in a particular context needs to
         * be converted to type {1}, but that's not possible for a value of
         * type {0}.
         * <p>
         *  翻译者注意：替换文本指的是数据类型。如果特定上下文中的值需要转换为类型{1},那么将显示该消息,但对于类型为{0}的值不可能。
         * 
         */
        {ErrorMsg.DATA_CONVERSION_ERR,
        "\uB370\uC774\uD130 \uC720\uD615 ''{0}''\uC744(\uB97C) ''{1}''(\uC73C)\uB85C \uBCC0\uD658\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "Templates" is a Java class name that should
         * not be translated.
         * <p>
         *  注意翻译者："模板"是不应该翻译的Java类名。
         * 
         */
        {ErrorMsg.NO_TRANSLET_CLASS_ERR,
        "\uC774 Templates\uC5D0\uB294 \uC801\uD569\uD55C translet \uD074\uB798\uC2A4 \uC815\uC758\uAC00 \uD3EC\uD568\uB418\uC5B4 \uC788\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "Templates" is a Java class name that should
         * not be translated.
         * <p>
         *  注意翻译者："模板"是不应该翻译的Java类名。
         * 
         */
        {ErrorMsg.NO_MAIN_TRANSLET_ERR,
        "\uC774 Templates\uC5D0\uB294 \uC774\uB984\uC774 ''{0}''\uC778 \uD074\uB798\uC2A4\uAC00 \uD3EC\uD568\uB418\uC5B4 \uC788\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a class.
         * <p>
         *  翻译者注意：替换文本是类的名称。
         * 
         */
        {ErrorMsg.TRANSLET_CLASS_ERR,
        "Translet \uD074\uB798\uC2A4 ''{0}''\uC744(\uB97C) \uB85C\uB4DC\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        {ErrorMsg.TRANSLET_OBJECT_ERR,
        "Translet \uD074\uB798\uC2A4\uAC00 \uB85C\uB4DC\uB418\uC5C8\uC9C0\uB9CC translet \uC778\uC2A4\uD134\uC2A4\uB97C \uC0DD\uC131\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "ErrorListener" is a Java interface name that
         * should not be translated.  The message indicates that the user tried
         * to set an ErrorListener object on object of the class named in the
         * substitution text with "null" Java value.
         * <p>
         *  注意翻译者："ErrorListener"是不应该翻译的Java接口名称。该消息表示用户尝试在替换文本中以"null"Java值命名的类的对象上设置ErrorListener对象。
         * 
         */
        {ErrorMsg.ERROR_LISTENER_NULL_ERR,
        "''{0}''\uC5D0 \uB300\uD55C ErrorListener\uB97C null\uB85C \uC124\uC815\uD558\uB824\uACE0 \uC2DC\uB3C4\uD558\uB294 \uC911"},

        /*
         * Note to translators:  StreamSource, SAXSource and DOMSource are Java
         * interface names that should not be translated.
         * <p>
         *  注意翻译者：StreamSource,SAXSource和DOMSource是不应该翻译的Java接口名称。
         * 
         */
        {ErrorMsg.JAXP_UNKNOWN_SOURCE_ERR,
        "XSLTC\uB294 StreamSource, SAXSource \uBC0F DOMSource\uB9CC \uC9C0\uC6D0\uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  "Source" is a Java class name that should not
         * be translated.  The substitution text is the name of Java method.
         * <p>
         * 注意翻译者："源"是一个Java类名,不应该翻译。替换文本是Java方法的名称。
         * 
         */
        {ErrorMsg.JAXP_NO_SOURCE_ERR,
        "''{0}''(\uC73C)\uB85C \uC804\uB2EC\uB41C Source \uAC1D\uCCB4\uC5D0 \uCF58\uD150\uCE20\uAC00 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The message indicates that XSLTC failed to
         * compile the stylesheet into a translet (class file).
         * <p>
         *  注意翻译者：消息指示XSLTC未能将样式表编译为translet(类文件)。
         * 
         */
        {ErrorMsg.JAXP_COMPILE_ERR,
        "\uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uB97C \uCEF4\uD30C\uC77C\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "TransformerFactory" is a class name.  In this
         * context, an attribute is a property or setting of the
         * TransformerFactory object.  The substitution text is the name of the
         * unrecognised attribute.  The method used to retrieve the attribute is
         * "getAttribute", so it's not clear whether it would be best to
         * translate the term "attribute".
         * <p>
         *  注意翻译者："TransformerFactory"是一个类名。在此上下文中,属性是TransformerFactory对象的属性或设置。替换文本是无法识别的属性的名称。
         * 用于检索属性的方法是"getAttribute",因此不清楚是否最好翻译术语"attribute"。
         * 
         */
        {ErrorMsg.JAXP_INVALID_ATTR_ERR,
        "TransformerFactory\uC5D0\uC11C ''{0}'' \uC18D\uC131\uC744 \uC778\uC2DD\uD558\uC9C0 \uBABB\uD588\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "setResult()" and "startDocument()" are Java
         * method names that should not be translated.
         * <p>
         *  注意翻译者："setResult()"和"startDocument()"是不应该翻译的Java方法名称。
         * 
         */
        {ErrorMsg.JAXP_SET_RESULT_ERR,
        "setResult()\uB294 startDocument() \uC55E\uC5D0 \uD638\uCD9C\uB418\uC5B4\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  "Transformer" is a Java interface name that
         * should not be translated.  A Transformer object should contained a
         * reference to a translet object in order to be used for
         * transformations; this message is produced if that requirement is not
         * met.
         * <p>
         *  对于翻译者的注意："Transformer"是不应该翻译的Java接口名称。 Transformer对象应该包含对translet对象的引用,以便用于转换;如果不满足该要求,则生成此消息。
         * 
         */
        {ErrorMsg.JAXP_NO_TRANSLET_ERR,
        "Transformer\uC5D0 \uCEA1\uC290\uD654\uB41C translet \uAC1D\uCCB4\uAC00 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The XML document that results from a
         * transformation needs to be sent to an output handler object; this
         * message is produced if that requirement is not met.
         * <p>
         *  对转换器的注意：从转换产生的XML文档需要发送到输出处理程序对象;如果不满足该要求,则生成此消息。
         * 
         */
        {ErrorMsg.JAXP_NO_HANDLER_ERR,
        "\uBCC0\uD658 \uACB0\uACFC\uC5D0 \uB300\uD574 \uC815\uC758\uB41C \uCD9C\uB825 \uCC98\uB9AC\uAE30\uAC00 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "Result" is a Java interface name in this
         * context.  The substitution text is a method name.
         * <p>
         *  对于翻译者的注意："Result"是此上下文中的Java接口名称。替换文本是一个方法名称。
         * 
         */
        {ErrorMsg.JAXP_NO_RESULT_ERR,
        "''{0}''(\uC73C)\uB85C \uC804\uB2EC\uB41C Result \uAC1D\uCCB4\uAC00 \uBD80\uC801\uD569\uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  "Transformer" is a Java interface name.  The
         * user's program attempted to access an unrecognized property with the
         * name specified in the substitution text.  The method used to retrieve
         * the property is "getOutputProperty", so it's not clear whether it
         * would be best to translate the term "property".
         * <p>
         * 注意转换器："Transformer"是一个Java接口名称。用户程序尝试使用替换文本中指定的名称访问无法识别的属性。
         * 用于检索属性的方法是"getOutputProperty",因此不清楚是否最好翻译术语"属性"。
         * 
         */
        {ErrorMsg.JAXP_UNKNOWN_PROP_ERR,
        "\uBD80\uC801\uD569\uD55C Transformer \uC18D\uC131 ''{0}''\uC5D0 \uC561\uC138\uC2A4\uD558\uB824\uACE0 \uC2DC\uB3C4\uD558\uB294 \uC911\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  SAX2DOM is the name of a Java class that should
         * not be translated.  This is an adapter in the sense that it takes a
         * DOM object and converts it to something that uses the SAX API.
         * <p>
         *  注意翻译者：SAX2DOM是不应被翻译的Java类的名称。这是一个适配器,它意味着它需要一个DOM对象并将其转换为使用SAX API的东西。
         * 
         */
        {ErrorMsg.SAX2DOM_ADAPTER_ERR,
        "SAX2DOM \uC5B4\uB311\uD130\uB97C \uC0DD\uC131\uD560 \uC218 \uC5C6\uC74C: ''{0}''."},

        /*
         * Note to translators:  "XSLTCSource.build()" is a Java method name.
         * "systemId" is an XML term that is short for "system identification".
         * <p>
         *  注意翻译者："XSLTCSource.build()"是一个Java方法名称。 "systemId"是"系统标识"的缩写的XML术语。
         * 
         */
        {ErrorMsg.XSLTC_SOURCE_ERR,
        "systemId\uB97C \uC124\uC815\uD558\uC9C0 \uC54A\uC740 \uC0C1\uD0DC\uB85C XSLTCSource.build()\uAC00 \uD638\uCD9C\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        { ErrorMsg.ER_RESULT_NULL,
            "\uACB0\uACFC\uB294 \uB110\uC774 \uC544\uB2C8\uC5B4\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message indicates that the value argument
         * of setParameter must be a valid Java Object.
         * <p>
         *  翻译者注意：此消息表明setParameter的value参数必须是有效的Java对象。
         * 
         */
        {ErrorMsg.JAXP_INVALID_SET_PARAM_VALUE,
        "{0} \uB9E4\uAC1C\uBCC0\uC218\uC758 \uAC12\uC740 \uC801\uD569\uD55C Java \uAC1D\uCCB4\uC5EC\uC57C \uD569\uB2C8\uB2E4."},


        {ErrorMsg.COMPILE_STDIN_ERR,
        "-i \uC635\uC158\uC740 -o \uC635\uC158\uACFC \uD568\uAED8 \uC0AC\uC6A9\uD574\uC57C \uD569\uB2C8\uB2E4."},


        /*
         * Note to translators:  This message contains usage information for a
         * means of invoking XSLTC from the command-line.  The message is
         * formatted for presentation in English.  The strings <output>,
         * <directory>, etc. indicate user-specified argument values, and can
         * be translated - the argument <package> refers to a Java package, so
         * it should be handled in the same way the term is handled for JDK
         * documentation.
         * <p>
         *  注意翻译者：此消息包含从命令行调用XSLTC的方法的使用信息。消息格式化为英语演示。
         * 字符串<output>,<directory>等表示用户指定的参数值,并且可以翻译 - 参数<package>是指Java包,因此它应该按照与JDK相同的方式处理文档。
         * 
         */
        {ErrorMsg.COMPILE_USAGE_STR,
        "\uC0AC\uC6A9\uBC95\n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile [-o <output>]\n      [-d <directory>] [-j <jarfile>] [-p <package>]\n      [-n] [-x] [-u] [-v] [-h] { <stylesheet> | -i }\n\n\uC635\uC158\n   -o <output>    \uC0DD\uC131\uB41C translet\uC5D0 <output> \uC774\uB984\uC744\n                  \uC9C0\uC815\uD569\uB2C8\uB2E4. \uAE30\uBCF8\uC801\uC73C\uB85C translet \uC774\uB984\uC740\n                  <stylesheet> \uC774\uB984\uC5D0\uC11C \uD30C\uC0DD\uB429\uB2C8\uB2E4. \uC5EC\uB7EC \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uB97C\n                  \uCEF4\uD30C\uC77C\uD558\uB294 \uACBD\uC6B0 \uC774 \uC635\uC158\uC740 \uBB34\uC2DC\uB429\uB2C8\uB2E4.\n   -d <directory> translet\uC5D0 \uB300\uD55C \uB300\uC0C1 \uB514\uB809\uD1A0\uB9AC\uB97C \uC9C0\uC815\uD569\uB2C8\uB2E4.\n   -j <jarfile>   translet \uD074\uB798\uC2A4\uB97C <jarfile>\uC774\uB77C\uB294 \uC774\uB984\uC774 \uC9C0\uC815\uB41C jar \uD30C\uC77C\uC5D0\n                  \uD328\uD0A4\uC9C0\uD654\uD569\uB2C8\uB2E4.\n   -p <package>   \uC0DD\uC131\uB41C \uBAA8\uB4E0 translet \uD074\uB798\uC2A4\uC5D0 \uB300\uD574 \uD328\uD0A4\uC9C0 \uC774\uB984 \uC811\uB450\uC5B4\uB97C\n                  \uC9C0\uC815\uD569\uB2C8\uB2E4.\n   -n             \uD15C\uD50C\uB9AC\uD2B8 \uC778\uB77C\uC778\uC744 \uC0AC\uC6A9\uC73C\uB85C \uC124\uC815\uD569\uB2C8\uB2E4. \uC77C\uBC18\uC801\uC73C\uB85C \uAE30\uBCF8 \uB3D9\uC791\uC744\n                  \uC0AC\uC6A9\uD558\uB294 \uAC83\uC774 \uC88B\uC2B5\uB2C8\uB2E4.\n   -x             \uCD94\uAC00 \uB514\uBC84\uAE45 \uBA54\uC2DC\uC9C0 \uCD9C\uB825\uC744 \uC124\uC815\uD569\uB2C8\uB2E4.\n   -u             <stylesheet> \uC778\uC218\uB97C URL\uB85C \uD574\uC11D\uD569\uB2C8\uB2E4.\n   -i             \uCEF4\uD30C\uC77C\uB7EC\uAC00 stdin\uC5D0\uC11C \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uB97C \uAC15\uC81C\uB85C \uC77D\uB3C4\uB85D \uD569\uB2C8\uB2E4.\n   -v             \uCEF4\uD30C\uC77C\uB7EC\uC758 \uBC84\uC804\uC744 \uC778\uC1C4\uD569\uB2C8\uB2E4.\n   -h             \uC774 \uC0AC\uC6A9\uBC95 \uC9C0\uCE68\uC744 \uC778\uC1C4\uD569\uB2C8\uB2E4.\n"},

        /*
         * Note to translators:  This message contains usage information for a
         * means of invoking XSLTC from the command-line.  The message is
         * formatted for presentation in English.  The strings <jarfile>,
         * <document>, etc. indicate user-specified argument values, and can
         * be translated - the argument <class> refers to a Java class, so it
         * should be handled in the same way the term is handled for JDK
         * documentation.
         * <p>
         * 注意翻译者：此消息包含从命令行调用XSLTC的方法的使用信息。消息格式化为英语演示。
         * 字符串<jarfile>,<document>等表示用户指定的参数值,并且可以翻译 - 参数<class>指的是Java类,因此它应该以与处理JDK相同的方式处理文档。
         * 
         */
        {ErrorMsg.TRANSFORM_USAGE_STR,
        "\uC0AC\uC6A9\uBC95 \n   java com.sun.org.apache.xalan.internal.xsltc.cmdline.Transform [-j <jarfile>]\n      [-x] [-n <iterations>] {-u <document_url> | <document>}\n      <class> [<param1>=<value1> ...]\n\n   translet <class>\uB97C \uC0AC\uC6A9\uD558\uC5EC <document>\uB85C \uC9C0\uC815\uB41C XML \uBB38\uC11C\uB97C \n   \uBCC0\uD658\uD569\uB2C8\uB2E4. translet <class>\uB294 \n   \uC0AC\uC6A9\uC790\uC758 CLASSPATH \uB610\uB294 \uC120\uD0DD\uC801\uC73C\uB85C \uC9C0\uC815\uB41C <jarfile>\uC5D0 \uC788\uC2B5\uB2C8\uB2E4.\n\uC635\uC158\n   -j <jarfile>    translet\uC744 \uB85C\uB4DC\uD574 \uC62C jarfile\uC744 \uC9C0\uC815\uD569\uB2C8\uB2E4.\n   -x              \uCD94\uAC00 \uB514\uBC84\uAE45 \uBA54\uC2DC\uC9C0 \uCD9C\uB825\uC744 \uC124\uC815\uD569\uB2C8\uB2E4.\n   -n <iterations> \uBCC0\uD658\uC744 <iterations>\uD68C \uC2E4\uD589\uD558\uACE0\n                   \uD504\uB85C\uD30C\uC77C \uC791\uC131 \uC815\uBCF4\uB97C \uD45C\uC2DC\uD569\uB2C8\uB2E4.\n   -u <document_url> XML \uC785\uB825 \uBB38\uC11C\uB97C URL\uB85C \uC9C0\uC815\uD569\uB2C8\uB2E4.\n"},



        /*
         * Note to translators:  "<xsl:sort>", "<xsl:for-each>" and
         * "<xsl:apply-templates>" are keywords that should not be translated.
         * The message indicates that an xsl:sort element must be a child of
         * one of the other kinds of elements mentioned.
         * <p>
         *  注意翻译者："<xsl：sort>","<xsl：for-each>"和"<xsl：apply-templates>"是不应翻译的关键字。
         * 消息指示xsl：sort元素必须是所提及的其他种类的元素的子元素。
         * 
         */
        {ErrorMsg.STRAY_SORT_ERR,
        "<xsl:sort>\uB294 <xsl:for-each> \uB610\uB294 <xsl:apply-templates>\uC5D0\uC11C\uB9CC \uC0AC\uC6A9\uD560 \uC218 \uC788\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The message indicates that the encoding
         * requested for the output document was on that requires support that
         * is not available from the Java Virtual Machine being used to execute
         * the program.
         * <p>
         *  转换器注意事项：消息表明对输出文档请求的编码是需要支持的,而这些支持不能从用于执行程序的Java虚拟机上获得。
         * 
         */
        {ErrorMsg.UNSUPPORTED_ENCODING,
        "\uC774 JVM\uC5D0\uC11C\uB294 \uCD9C\uB825 \uC778\uCF54\uB529 ''{0}''\uC774(\uAC00) \uC9C0\uC6D0\uB418\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The message indicates that the XPath expression
         * named in the substitution text was not well formed syntactically.
         * <p>
         *  注意翻译者：消息表明替换文本中命名的XPath表达式没有很好地形成语法。
         * 
         */
        {ErrorMsg.SYNTAX_ERR,
        "''{0}''\uC5D0 \uAD6C\uBB38 \uC624\uB958\uAC00 \uC788\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a Java
         * class.  The term "constructor" here is the Java term.  The message is
         * displayed if XSLTC could not find a constructor for the specified
         * class.
         * <p>
         *  翻译者注意：替换文本是Java类的名称。这里的术语"构造函数"是Java术语。如果XSLTC找不到指定类的构造函数,则显示该消息。
         * 
         */
        {ErrorMsg.CONSTRUCTOR_NOT_FOUND,
        "\uC678\uBD80 constructor ''{0}''\uC744(\uB97C) \uCC3E\uC744 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  "static" is the Java keyword.  The substitution
         * text is the name of a function.  The first argument of that function
         * is not of the required type.
         * <p>
         *  注意转换器："static"是Java关键字。替换文本是函数的名称。该函数的第一个参数不是必需的类型。
         * 
         */
        {ErrorMsg.NO_JAVA_FUNCT_THIS_REF,
        "\uBE44static Java \uD568\uC218 ''{0}''\uC5D0 \uB300\uD55C \uCCAB\uBC88\uC9F8 \uC778\uC218\uB294 \uC801\uD569\uD55C \uAC1D\uCCB4 \uCC38\uC870\uAC00 \uC544\uB2D9\uB2C8\uB2E4."},

        /*
         * Note to translators:  An XPath expression was not of the type
         * required in a particular context.  The substitution text is the
         * expression that was in error.
         * <p>
         * 翻译者注意：XPath表达式不是特定上下文中所需的类型。替换文本是错误的表达式。
         * 
         */
        {ErrorMsg.TYPE_CHECK_ERR,
        "''{0}'' \uD45C\uD604\uC2DD\uC758 \uC720\uD615\uC744 \uD655\uC778\uD558\uB294 \uC911 \uC624\uB958\uAC00 \uBC1C\uC0DD\uD588\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  An XPath expression was not of the type
         * required in a particular context.  However, the location of the
         * problematic expression is unknown.
         * <p>
         *  翻译者注意：XPath表达式不是特定上下文中所需的类型。然而,有问题的表达式的位置是未知的。
         * 
         */
        {ErrorMsg.TYPE_CHECK_UNK_LOC_ERR,
        "\uC54C \uC218 \uC5C6\uB294 \uC704\uCE58\uC5D0\uC11C \uD45C\uD604\uC2DD\uC758 \uC720\uD615\uC744 \uD655\uC778\uD558\uB294 \uC911 \uC624\uB958\uAC00 \uBC1C\uC0DD\uD588\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a command-
         * line option that was not recognized.
         * <p>
         *  翻译者注意：替换文本是无法识别的命令行选项的名称。
         * 
         */
        {ErrorMsg.ILLEGAL_CMDLINE_OPTION_ERR,
        "\uBA85\uB839\uD589 \uC635\uC158 ''{0}''\uC774(\uAC00) \uBD80\uC801\uD569\uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  The substitution text is the name of a command-
         * line option.
         * <p>
         *  注意翻译者：替换文本是命令行选项的名称。
         * 
         */
        {ErrorMsg.CMDLINE_OPT_MISSING_ARG_ERR,
        "\uBA85\uB839\uD589 \uC635\uC158 ''{0}''\uC5D0 \uD544\uC218 \uC778\uC218\uAC00 \uB204\uB77D\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text contains two error
         * messages.  The spacing before the second substitution text indents
         * it the same amount as the first in English.
         * <p>
         *  翻译者注意：此消息用于指示另一封邮件的严重性。替换文本包含两个错误消息。第二个替换文本之前的间距缩进与英语中第一个相同的量。
         * 
         */
        {ErrorMsg.WARNING_PLUS_WRAPPED_MSG,
        "WARNING:  ''{0}''\n       :{1}"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text is an error message.
         * <p>
         *  翻译者注意：此消息用于指示另一封邮件的严重性。替换文本是错误消息。
         * 
         */
        {ErrorMsg.WARNING_MSG,
        "WARNING:  ''{0}''"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text contains two error
         * messages.  The spacing before the second substitution text indents
         * it the same amount as the first in English.
         * <p>
         *  翻译者注意：此消息用于指示另一封邮件的严重性。替换文本包含两个错误消息。第二个替换文本之前的间距缩进与英语中第一个相同的量。
         * 
         */
        {ErrorMsg.FATAL_ERR_PLUS_WRAPPED_MSG,
        "FATAL ERROR:  ''{0}''\n           :{1}"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text is an error message.
         * <p>
         *  翻译者注意：此消息用于指示另一封邮件的严重性。替换文本是错误消息。
         * 
         */
        {ErrorMsg.FATAL_ERR_MSG,
        "FATAL ERROR:  ''{0}''"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text contains two error
         * messages.  The spacing before the second substitution text indents
         * it the same amount as the first in English.
         * <p>
         * 翻译者注意：此消息用于指示另一封邮件的严重性。替换文本包含两个错误消息。第二个替换文本之前的间距缩进与英语中第一个相同的量。
         * 
         */
        {ErrorMsg.ERROR_PLUS_WRAPPED_MSG,
        "ERROR:  ''{0}''\n     :{1}"},

        /*
         * Note to translators:  This message is used to indicate the severity
         * of another message.  The substitution text is an error message.
         * <p>
         *  翻译者注意：此消息用于指示另一封邮件的严重性。替换文本是错误消息。
         * 
         */
        {ErrorMsg.ERROR_MSG,
        "ERROR:  ''{0}''"},

        /*
         * Note to translators:  The substitution text is the name of a class.
         * <p>
         *  翻译者注意：替换文本是类的名称。
         * 
         */
        {ErrorMsg.TRANSFORM_WITH_TRANSLET_STR,
        "translet ''{0}''\uC744(\uB97C) \uC0AC\uC6A9\uD558\uC5EC \uBCC0\uD658\uD558\uC2ED\uC2DC\uC624. "},

        /*
         * Note to translators:  The first substitution is the name of a class,
         * while the second substitution is the name of a jar file.
         * <p>
         *  注意翻译者：第一个替换是类的名称,而第二个替换是jar文件的名称。
         * 
         */
        {ErrorMsg.TRANSFORM_WITH_JAR_STR,
        "jar \uD30C\uC77C ''{1}''\uC758 translet ''{0}''\uC744(\uB97C) \uC0AC\uC6A9\uD558\uC5EC \uBCC0\uD658\uD558\uC2ED\uC2DC\uC624."},

        /*
         * Note to translators:  "TransformerFactory" is the name of a Java
         * interface and must not be translated.  The substitution text is
         * the name of the class that could not be instantiated.
         * <p>
         *  注意转换器："TransformerFactory"是Java接口的名称,不能翻译。替换文本是无法实例化的类的名称。
         * 
         */
        {ErrorMsg.COULD_NOT_CREATE_TRANS_FACT,
        "TransformerFactory \uD074\uB798\uC2A4 ''{0}''\uC758 \uC778\uC2A4\uD134\uC2A4\uB97C \uC0DD\uC131\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message is produced when the user
         * specified a name for the translet class that contains characters
         * that are not permitted in a Java class name.  The substitution
         * text "{0}" specifies the name the user requested, while "{1}"
         * specifies the name the processor used instead.
         * <p>
         *  翻译者注意：当用户为包含Java类名称中不允许的字符的translet类指定名称时,会生成此消息。替换文本"{0}"指定用户请求的名称,而"{1}"指定处理器使用的名称。
         * 
         */
        {ErrorMsg.TRANSLET_NAME_JAVA_CONFLICT,
         "''{0}'' \uC774\uB984\uC5D0\uB294 Java \uD074\uB798\uC2A4 \uC774\uB984\uC5D0 \uD5C8\uC6A9\uB418\uC9C0 \uC54A\uB294 \uBB38\uC790\uAC00 \uD3EC\uD568\uB418\uC5B4 \uC788\uC5B4 \uC774 \uC774\uB984\uC744 translet \uD074\uB798\uC2A4\uC758 \uC774\uB984\uC73C\uB85C \uC0AC\uC6A9\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4. \uB300\uC2E0 ''{1}'' \uC774\uB984\uC774 \uC0AC\uC6A9\uB418\uC5C8\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  The following message is used as a header.
         * All the error messages are collected together and displayed beneath
         * this message.
         * <p>
         *  翻译者注意：以下消息用作标题。所有错误消息将一起收集并显示在此消息的下方。
         * 
         */
        {ErrorMsg.COMPILER_ERROR_KEY,
        "\uCEF4\uD30C\uC77C\uB7EC \uC624\uB958:"},

        /*
         * Note to translators:  The following message is used as a header.
         * All the warning messages are collected together and displayed
         * beneath this message.
         * <p>
         *  翻译者注意：以下消息用作标题。所有警告消息将一起收集并显示在此消息的下方。
         * 
         */
        {ErrorMsg.COMPILER_WARNING_KEY,
        "\uCEF4\uD30C\uC77C\uB7EC \uACBD\uACE0:"},

        /*
         * Note to translators:  The following message is used as a header.
         * All the error messages that are produced when the stylesheet is
         * applied to an input document are collected together and displayed
         * beneath this message.  A 'translet' is the compiled form of a
         * stylesheet (see above).
         * <p>
         * 翻译者注意：以下消息用作标题。将样式表应用于输入文档时生成的所有错误消息一起收集并显示在此消息下面。 "translet"是样式表的编译形式(见上文)。
         * 
         */
        {ErrorMsg.RUNTIME_ERROR_KEY,
        "Translet \uC624\uB958:"},

        /*
         * Note to translators:  An attribute whose value is constrained to
         * be a "QName" or a list of "QNames" had a value that was incorrect.
         * 'QName' is an XML syntactic term that must not be translated.  The
         * substitution text contains the actual value of the attribute.
         * <p>
         *  翻译者注意：值被限制为"QName"或"QNames"列表的属性的值不正确。 'QName'是一个XML语法术语,不能翻译。替换文本包含属性的实际值。
         * 
         */
        {ErrorMsg.INVALID_QNAME_ERR,
        "\uAC12\uC774 QName \uB610\uB294 \uACF5\uBC31\uC73C\uB85C \uAD6C\uBD84\uB41C QName \uBAA9\uB85D\uC774\uC5B4\uC57C \uD558\uB294 \uC18D\uC131\uC758 \uAC12\uC774 ''{0}''\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  An attribute whose value is required to
         * be an "NCName".
         * 'NCName' is an XML syntactic term that must not be translated.  The
         * substitution text contains the actual value of the attribute.
         * <p>
         *  翻译者注意：其值必须为"NCName"的属性。 "NCName"是不能翻译的XML句法术语。替换文本包含属性的实际值。
         * 
         */
        {ErrorMsg.INVALID_NCNAME_ERR,
        "\uAC12\uC774 NCName\uC774\uC5B4\uC57C \uD558\uB294 \uC18D\uC131\uC758 \uAC12\uC774 ''{0}''\uC785\uB2C8\uB2E4."},

        /*
         * Note to translators:  An attribute with an incorrect value was
         * encountered.  The permitted value is one of the literal values
         * "xml", "html" or "text"; it is also permitted to have the form of
         * a QName that is not also an NCName.  The terms "method",
         * "xsl:output", "xml", "html" and "text" are keywords that must not
         * be translated.  The term "qname-but-not-ncname" is an XML syntactic
         * term.  The substitution text contains the actual value of the
         * attribute.
         * <p>
         *  翻译员注意事项：遇到了具有不正确值的属性。允许的值是字面值"xml","html"或"text"之一;它也被允许具有不是NCName的QName的形式。
         * 术语"method","xsl：output","xml","html"和"text"是不能翻译的关键字。术语"qname-but-not-ncname"是一个XML句法术语。
         * 替换文本包含属性的实际值。
         * 
         */
        {ErrorMsg.INVALID_METHOD_IN_OUTPUT,
        "<xsl:output> \uC694\uC18C\uC5D0 \uB300\uD55C method \uC18D\uC131\uC758 \uAC12\uC774 ''{0}''\uC785\uB2C8\uB2E4. \uAC12\uC740 ''xml'', ''html'', ''text'' \uB610\uB294 qname-but-not-ncname \uC911 \uD558\uB098\uC5EC\uC57C \uD569\uB2C8\uB2E4."},

        {ErrorMsg.JAXP_GET_FEATURE_NULL_NAME,
        "\uAE30\uB2A5 \uC774\uB984\uC740 TransformerFactory.getFeature(\uBB38\uC790\uC5F4 \uC774\uB984)\uC5D0\uC11C \uB110\uC77C \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        {ErrorMsg.JAXP_SET_FEATURE_NULL_NAME,
        "\uAE30\uB2A5 \uC774\uB984\uC740 TransformerFactory.setFeature(\uBB38\uC790\uC5F4 \uC774\uB984, \uBD80\uC6B8 \uAC12)\uC5D0\uC11C \uB110\uC77C \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        {ErrorMsg.JAXP_UNSUPPORTED_FEATURE,
        "\uC774 TransformerFactory\uC5D0\uC11C ''{0}'' \uAE30\uB2A5\uC744 \uC124\uC815\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        {ErrorMsg.JAXP_SECUREPROCESSING_FEATURE,
        "FEATURE_SECURE_PROCESSING: \uBCF4\uC548 \uAD00\uB9AC\uC790\uAC00 \uC788\uC744 \uACBD\uC6B0 \uAE30\uB2A5\uC744 false\uB85C \uC124\uC815\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message describes an internal error in the
         * processor.  The term "byte code" is a Java technical term for the
         * executable code in a Java method, and "try-catch-finally block"
         * refers to the Java keywords with those names.  "Outlined" is a
         * technical term internal to XSLTC and should not be translated.
         * <p>
         * 翻译者注意：此消息描述处理器中的内部错误。术语"字节代码"是Java方法中的可执行代码的Java技术术语,并且"try-catch-finally块"是指具有那些名称的Java关键字。
         *  "概述"是XSLTC内部的技术术语,不应翻译。
         * 
         */
        {ErrorMsg.OUTLINE_ERR_TRY_CATCH,
         "\uB0B4\uBD80 XSLTC \uC624\uB958: \uC0DD\uC131\uB41C \uBC14\uC774\uD2B8 \uCF54\uB4DC\uAC00 try-catch-finally \uBE14\uB85D\uC744 \uD3EC\uD568\uD558\uBBC0\uB85C outlined \uCC98\uB9AC\uD560 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message describes an internal error in the
         * processor.  The terms "OutlineableChunkStart" and
         * "OutlineableChunkEnd" are the names of classes internal to XSLTC and
         * should not be translated.  The message indicates that for every
         * "start" there must be a corresponding "end", and vice versa, and
         * that if one of a pair of "start" and "end" appears between another
         * pair of corresponding "start" and "end", then the other half of the
         * pair must also be between that same enclosing pair.
         * <p>
         *  翻译者注意：此消息描述处理器中的内部错误。术语"OutlineableChunkStart"和"OutlineableChunkEnd"是XSLTC内部的类的名称,不应翻译。
         * 该消息指示对于每个"开始",必须有相应的"结束",反之亦然,并且如果一对"开始"和"结束"中的一个出现在另一对相应的"开始" ,那么该对的另一半也必须在同一封闭对之间。
         * 
         */
        {ErrorMsg.OUTLINE_ERR_UNBALANCED_MARKERS,
         "\uB0B4\uBD80 XSLTC \uC624\uB958: OutlineableChunkStart \uBC0F OutlineableChunkEnd \uD45C\uC2DC\uC790\uC758 \uC9DD\uC774 \uB9DE\uC544\uC57C \uD558\uACE0 \uC62C\uBC14\uB974\uAC8C \uC911\uCCA9\uB418\uC5B4\uC57C \uD569\uB2C8\uB2E4."},

        /*
         * Note to translators:  This message describes an internal error in the
         * processor.  The term "byte code" is a Java technical term for the
         * executable code in a Java method.  The "method" that is being
         * referred to is a Java method in a translet that XSLTC is generating
         * in processing a stylesheet.  The "instruction" that is being
         * referred to is one of the instrutions in the Java byte code in that
         * method.  "Outlined" is a technical term internal to XSLTC and
         * should not be translated.
         * <p>
         *  翻译者注意：此消息描述处理器中的内部错误。术语"字节代码"是Java方法中的可执行代码的Java技术术语。被引用的"方法"是XSLTC在处理样式表时生成的translet中的Java方法。
         * 被引用的"指令"是该方法中的Java字节代码中的一个指令。 "概述"是XSLTC内部的技术术语,不应翻译。
         * 
         */
        {ErrorMsg.OUTLINE_ERR_DELETED_TARGET,
         "\uB0B4\uBD80 XSLTC \uC624\uB958: outlined \uCC98\uB9AC\uB41C \uBC14\uC774\uD2B8 \uCF54\uB4DC \uBE14\uB85D\uC5D0 \uC18D\uD55C \uBA85\uB839\uC774 \uC5EC\uC804\uD788 \uC6D0\uB798 \uBA54\uC18C\uB4DC\uC5D0\uC11C \uCC38\uC870\uB429\uB2C8\uB2E4."
        },


        /*
         * Note to translators:  This message describes an internal error in the
         * processor.  The "method" that is being referred to is a Java method
         * in a translet that XSLTC is generating.
         *
         * <p>
         */
        {ErrorMsg.OUTLINE_ERR_METHOD_TOO_BIG,
         "\uB0B4\uBD80 XSLTC \uC624\uB958: translet\uC758 \uBA54\uC18C\uB4DC\uAC00 Java Virtual Machine\uC758 \uBA54\uC18C\uB4DC \uAE38\uC774 \uC81C\uD55C\uC778 64KB\uB97C \uCD08\uACFC\uD569\uB2C8\uB2E4. \uB300\uAC1C \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uC758 \uD15C\uD50C\uB9AC\uD2B8\uAC00 \uB9E4\uC6B0 \uD06C\uAE30 \uB54C\uBB38\uC5D0 \uBC1C\uC0DD\uD569\uB2C8\uB2E4. \uB354 \uC791\uC740 \uD15C\uD50C\uB9AC\uD2B8\uB97C \uC0AC\uC6A9\uD558\uB3C4\uB85D \uC2A4\uD0C0\uC77C\uC2DC\uD2B8\uB97C \uC7AC\uAD6C\uC131\uD574 \uBCF4\uC2ED\uC2DC\uC624."
        },

         {ErrorMsg.DESERIALIZE_TRANSLET_ERR, "Java \uBCF4\uC548\uC774 \uC0AC\uC6A9\uC73C\uB85C \uC124\uC815\uB41C \uACBD\uC6B0 TemplatesImpl \uC9C1\uB82C\uD654 \uD574\uC81C\uC5D0 \uB300\uD55C \uC9C0\uC6D0\uC774 \uC0AC\uC6A9 \uC548\uD568\uC73C\uB85C \uC124\uC815\uB429\uB2C8\uB2E4. jdk.xml.enableTemplatesImplDeserialization \uC2DC\uC2A4\uD15C \uC18D\uC131\uC744 true\uB85C \uC124\uC815\uD558\uBA74 \uC774\uB97C \uBB34\uD6A8\uD654\uD560 \uC218 \uC788\uC2B5\uB2C8\uB2E4."}

    };

    }
}
