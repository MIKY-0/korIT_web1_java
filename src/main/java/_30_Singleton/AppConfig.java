package _30_Singleton;

//(문제1)AppConfig클래스를 싱글톤으로 구현
public class AppConfig {
    private String apiKey;
    private String appMode;
    private static AppConfig single; //저장할 필드 하나 생성(A)

    public static AppConfig getSingle(){ //(A)
        if(single == null){
            single = new AppConfig(); //private라도 내부호출이니 상관 X.
        }
        return single;
    }
    //상수로 변경 (A)
    public static final String DEV_MODE = "DEV_MODE";
    public static final String PRODUCTION_MODE = "PRODUCTION_MODE";

    private AppConfig() {
        this.apiKey = "MY-API-KEY";
        this.appMode = DEV_MODE;
    }

    @Override
    public String toString() {//(A)
        return "AppConfig{" +
                "apiKey='" + apiKey + '\'' +
                ", appMode='" + appMode + '\'' +
                '}';
    }

    public void setAppMode(String appMode) {//(A)
        this.appMode = appMode;
    }
    }







