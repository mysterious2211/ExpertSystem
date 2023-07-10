<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2022/11/30
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>专家系统</title>
    <base href="<%=path%>">

</head>
<body>
    <div>
        <br>
        <form action="expert/true" method="post">
            <input type="checkbox" id="checkbox1" name="true1" value="有毛发" />有毛发
            <input type="checkbox" id="checkbox2" name="true2" value="有奶" />有奶
            <input type="checkbox" id="checkbox3" name="true3" value="有羽毛" />有羽毛
            <input type="checkbox" id="checkbox4" name="true4" value="会飞" />会飞
            <input type="checkbox" id="checkbox5" name="true5" value="会下蛋" />会下蛋
            <input type="checkbox" id="checkbox6" name="true6" value="吃肉" />吃肉
            <input type="checkbox" id="checkbox7" name="true7" value="有犬齿" />有犬齿
            <input type="checkbox" id="checkbox8" name="true8" value="有爪" />有爪
            <input type="checkbox" id="checkbox9" name="true9" value="眼睛盯前方" />眼睛盯前方
            <input type="checkbox" id="checkbox10" name="true10" value="有蹄" />有蹄<br/>
            <input type="checkbox" id="checkbox11" name="true11" value="嚼反刍" />嚼反刍
            <input type="checkbox" id="checkbox12" name="true12" value="黄褐色" />黄褐色
            <input type="checkbox" id="checkbox13" name="true13" value="有暗斑点" />有暗斑点
            <input type="checkbox" id="checkbox14" name="true14" value="有黑色条纹" />有黑色条纹
            <input type="checkbox" id="checkbox15" name="true15" value="长脖子" />长脖子
            <input type="checkbox" id="checkbox16" name="true16" value="长腿" />长腿
            <input type="checkbox" id="checkbox17" name="true17" value="不会飞" />不会飞
            <input type="checkbox" id="checkbox18" name="true18" value="会游泳" />会游泳
            <input type="checkbox" id="checkbox19" name="true19" value="黑白二色" />黑白二色
            <input type="checkbox" id="checkbox20" name="true20" value="善飞" />善飞<br>
            <%--<input type="checkbox" name="true21" value="哺乳动物" />哺乳动物
            <input type="checkbox" name="true22" value="鸟" />鸟
            <input type="checkbox" name="true23" value="食肉动物" />食肉动物
            <input type="checkbox" name="true24" value="有蹄类动物" />有蹄类动物--%>
            <input type="submit" name="查询" />


        </form><br>
        <div>
            <div>
                <c:if test="${successs == 1}">
                    <h3>执行结果是：</h3>
                </c:if>
            </div>
            <div>
                <c:if test="${successs == 1}">
                    <span>初始事实：</span><br/>
                </c:if>
                <c:if test="${!(trueThing.true1 ==null || trueThing.true1.equals(''))}">
                    <script>
                        document.getElementById("checkbox1").checked = true
                    </script>
                    <span>${trueThing.true1}</span>
                </c:if>
                <c:if test="${!(trueThing.true2 ==null || trueThing.true2.equals(''))}">
                    <script>
                        document.getElementById("checkbox2").checked = true
                    </script>
                    <span>${trueThing.true2}</span>
                </c:if>
                <c:if test="${!(trueThing.true3 ==null || trueThing.true3.equals(''))}">
                    <script>
                        document.getElementById("checkbox3").checked = true
                    </script>
                    <span>${trueThing.true3}</span>
                </c:if>
                <c:if test="${!(trueThing.true4 ==null || trueThing.true4.equals(''))}">
                    <script>
                        document.getElementById("checkbox4").checked = true
                    </script>
                    <span>${trueThing.true4}</span>
                </c:if>
                <c:if test="${!(trueThing.true5 ==null || trueThing.true5.equals(''))}">
                    <script>
                        document.getElementById("checkbox5").checked = true
                    </script>
                    <span>${trueThing.true5}</span>
                </c:if>
                <c:if test="${!(trueThing.true6 ==null || trueThing.true6.equals(''))}">
                    <script>
                        document.getElementById("checkbox6").checked = true
                    </script>
                    <span>${trueThing.true6}</span>
                </c:if><c:if test="${!(trueThing.true7 ==null || trueThing.true7.equals(''))}">
                <script>
                    document.getElementById("checkbox7").checked = true
                </script>
                <span>${trueThing.true7}</span>
                </c:if>
                <c:if test="${!(trueThing.true8 ==null || trueThing.true8.equals(''))}">
                    <script>
                        document.getElementById("checkbox8").checked = true
                    </script>
                    <span>${trueThing.true8}</span>
                </c:if>
                <c:if test="${!(trueThing.true9 ==null || trueThing.true9.equals(''))}">
                    <script>
                        document.getElementById("checkbox9").checked = true
                    </script>
                    <span>${trueThing.true9}</span>
                </c:if>
                <c:if test="${!(trueThing.true10 ==null || trueThing.true10.equals(''))}">
                    <script>
                        document.getElementById("checkbox10").checked = true
                    </script>
                    <span>${trueThing.true10}</span>
                </c:if>
                <c:if test="${!(trueThing.true11 ==null || trueThing.true11.equals(''))}">
                    <script>
                        document.getElementById("checkbox11").checked = true
                    </script>
                    <span>${trueThing.true11}</span>
                </c:if>
                <c:if test="${!(trueThing.true12 ==null || trueThing.true12.equals(''))}">
                    <script>
                        document.getElementById("checkbox12").checked = true
                    </script>
                    <span>${trueThing.true12}</span>
                </c:if>
                <c:if test="${!(trueThing.true13 ==null || trueThing.true13.equals(''))}">
                    <script>
                        document.getElementById("checkbox13").checked = true
                    </script>
                    <span>${trueThing.true13}</span>
                </c:if>
                <c:if test="${!(trueThing.true14 ==null || trueThing.true14.equals(''))}">
                    <script>
                        document.getElementById("checkbox14").checked = true
                    </script>
                    <span>${trueThing.true14}</span>
                </c:if>
                <c:if test="${!(trueThing.true15 ==null || trueThing.true15.equals(''))}">
                    <script>
                        document.getElementById("checkbox15").checked = true
                    </script>
                    <span>${trueThing.true15}</span>
                </c:if>
                <c:if test="${!(trueThing.true16 ==null || trueThing.true16.equals(''))}">
                    <script>
                        document.getElementById("checkbox16").checked = true
                    </script>
                    <span>${trueThing.true16}</span>
                </c:if>
                <c:if test="${!(trueThing.true17 ==null || trueThing.true17.equals(''))}">
                    <script>
                        document.getElementById("checkbox17").checked = true
                    </script>
                    <span>${trueThing.true17}</span>
                </c:if>
                <c:if test="${!(trueThing.true18 ==null || trueThing.true18.equals(''))}">
                    <script>
                        document.getElementById("checkbox18").checked = true
                    </script>
                    <span>${trueThing.true18}</span>
                </c:if>
                <c:if test="${!(trueThing.true19 ==null || trueThing.true19.equals(''))}">
                    <script>
                        document.getElementById("checkbox19").checked = true
                    </script>
                    <span>${trueThing.true19}</span>
                </c:if>
                <c:if test="${!(trueThing.true20 ==null || trueThing.true20.equals(''))}">
                    <script>
                        document.getElementById("checkbox20").checked = true
                    </script>
                    <span>${trueThing.true20}</span>
                </c:if>
            </div>
            <div>
                <c:if test="${successs == 1}">
                    <span><h4>结论：</h4></span>
                </c:if>
                <c:forEach items="${information}" var="info">
                    <span>${info}</span><br/>
                </c:forEach>
            </div>
        </div>

    </div>

</body>
</html>
