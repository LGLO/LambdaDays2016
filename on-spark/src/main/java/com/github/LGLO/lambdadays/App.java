package com.github.LGLO.lambdadays;

import frege.prelude.PreludeBase.TEither;
import frege.runtime.Delayed;
import spark.Route;
import static spark.Spark.get;
import static jsonlint.JsonLint.*;

public class App {
    
    public static void main(String[] args) {
        get("/validate", validateHandler);
        get("/", validateHandler);
    }

    private static Route validateHandler = (req, res) -> {
        String body = req.body();
        //For Frege types it is safe to assume result is lazy.
        TEither result = Delayed.<TEither>forced(validateJson(body));
        //It is safe to always pass strict arguments.
        res.status(statusCode(result));
        return output(result);
    };
    
}
