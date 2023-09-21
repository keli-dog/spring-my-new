package com.itheima.controller.ExceptionController;

public class SystemException extends RuntimeException {

        private final int code;
        private final String msg;

        public SystemException(int code, String msg) {
            super(msg);
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }
    }


