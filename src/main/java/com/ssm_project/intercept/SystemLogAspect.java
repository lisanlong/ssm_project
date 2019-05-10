package com.ssm_project.intercept;


import com.ssm_project.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
    @Aspect
    @Component
    public class SystemLogAspect {
        //注入Service用于把上传记录的相关数据信息保存到数据库
        @Autowired
        private LogService schemeProposalsService;


        //本地异常日志记录对象
        //private  static  final Logger logger = LoggerFactory.getLogger(UploadCountLogsAspect. class);

        //Controller层切点
        @Pointcut("@annotation(com.ssm_project.intercept.Logww)")
        public void controllerAspect() {
            System.out.println("切入点...");
        }

        /**
         * 前置通知 用于拦截Controller层 获取记录的操作信息
         *
         * @param joinPoint 切点
         */
        @Before("controllerAspect()")
        public void doBefore(JoinPoint joinPoint) {

            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
         //   User user = userRedisUtils.getUser(request);
          /*  try {
                //具体业务逻辑  根据业务需求进行更改
                UploadCount count = new UploadCount();
                count.setTid(UUID.randomUUID().toString());
                count.setModuleName(getControllerMethodDescription(joinPoint)[0]);
                count.setCreateUid(user.getUserId().toString());
                count.setDeptId(user.getDeptId());
                count.setDeptName(user.getDept());
                //保存数据库
                schemeProposalsService.addRecord(count);
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }

        /**
         * 获取注解中对方法的描述信息 用于Controller层注解
         *
         * @param joinPoint 切点
         * @return 方法描述
         * @throws Exception
         */
        public static String[] getControllerMethodDescription(JoinPoint joinPoint) throws Exception {
            String targetName = joinPoint.getTarget().getClass().getName();
            String methodName = joinPoint.getSignature().getName();
            Object[] arguments = joinPoint.getArgs();
            Class targetClass = Class.forName(targetName);
            Method[] methods = targetClass.getMethods();
            String[] annos = {""};
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    Class[] clazzs = method.getParameterTypes();
                }
            }
            return annos;
        }
    }