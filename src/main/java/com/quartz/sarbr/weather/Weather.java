package com.quartz.sarbr.weather;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Data
@Setter
@Getter
public class Weather {

    /**
     * status : 0
     * msg : ok
     * result : {"city":"西青区","cityid":2919,"citycode":"101030500","date":"2021-01-29","week":"星期五","weather":"晴","temp":"-2","temphigh":"3","templow":"-6","img":"0","humidity":"33","pressure":"1024","windspeed":"3.7","winddirect":"南风","windpower":"2级","updatetime":"2021-01-29 10:20:00","index":[{"iname":"空调指数","ivalue":"开启制暖空调","detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。"},{"iname":"运动指数","ivalue":"较不宜","detail":"天气较好，但考虑天气寒冷，推荐您进行室内运动，户外运动时请注意保暖并做好准备活动。"},{"iname":"紫外线指数","ivalue":"弱","detail":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"},{"iname":"感冒指数","ivalue":"较易发","detail":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"},{"iname":"洗车指数","ivalue":"较适宜","detail":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"iname":"空气污染扩散指数","ivalue":"较差","detail":"气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。"},{"iname":"穿衣指数","ivalue":"冷","detail":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"}],"aqi":{"so2":"15","so224":"7","no2":"61","no224":"40","co":"0.970","co24":"0.510","o3":"15","o38":"16","o324":"21","pm10":"72","pm1024":"47","pm2_5":"25","pm2_524":"13","iso2":"6","ino2":"31","ico":"10","io3":"5","io38":"9","ipm10":"62","ipm2_5":"36","aqi":"62","primarypollutant":"PM10","quality":"良","timepoint":"2021-01-29 09:00:00","aqiinfo":{"level":"二级","color":"#FFFF00","affect":"空气质量可接受，但某些污染物可能对极少数异常敏感人群健康有较弱影响","measure":"极少数异常敏感人群应减少户外活动"}},"daily":[{"date":"2021-01-29","week":"星期五","sunrise":"07:23","sunset":"17:28","night":{"weather":"晴","templow":"-6","img":"0","winddirect":"北风","windpower":"微风"},"day":{"weather":"晴","temphigh":"3","img":"0","winddirect":"东南风","windpower":"微风"}},{"date":"2021-01-30","week":"星期六","sunrise":"07:22","sunset":"17:30","night":{"weather":"晴","templow":"-6","img":"0","winddirect":"东风","windpower":"3-5级"},"day":{"weather":"晴","temphigh":"7","img":"0","winddirect":"东南风","windpower":"微风"}},{"date":"2021-01-31","week":"星期日","sunrise":"07:21","sunset":"17:31","night":{"weather":"多云","templow":"-4","img":"1","winddirect":"北风","windpower":"4-5级"},"day":{"weather":"多云","temphigh":"4","img":"1","winddirect":"西南风","windpower":"微风"}},{"date":"2021-02-01","week":"星期一","sunrise":"07:20","sunset":"17:32","night":{"weather":"晴","templow":"-8","img":"0","winddirect":"北风","windpower":"微风"},"day":{"weather":"晴","temphigh":"3","img":"0","winddirect":"北风","windpower":"4-5级"}},{"date":"2021-02-02","week":"星期二","sunrise":"07:19","sunset":"17:33","night":{"weather":"多云","templow":"-7","img":"1","winddirect":"西南风","windpower":"3-5级"},"day":{"weather":"晴","temphigh":"4","img":"0","winddirect":"西南风","windpower":"3-5级"}},{"date":"2021-02-03","week":"星期三","sunrise":"07:18","sunset":"17:34","night":{"weather":"晴","templow":"-8","img":"0","winddirect":"东风","windpower":"微风"},"day":{"weather":"多云","temphigh":"3","img":"1","winddirect":"北风","windpower":"3-5级"}},{"date":"2021-02-04","week":"星期四","sunrise":"07:17","sunset":"17:35","night":{"weather":"晴","templow":"-7","img":"0","winddirect":"西北风","windpower":"微风"},"day":{"weather":"晴","temphigh":"5","img":"0","winddirect":"西北风","windpower":"微风"}}],"hourly":[{"time":"10:00","weather":"晴","temp":"-5","img":"0"},{"time":"11:00","weather":"晴","temp":"-4","img":"0"},{"time":"12:00","weather":"晴","temp":"-1","img":"0"},{"time":"13:00","weather":"晴","temp":"1","img":"0"},{"time":"14:00","weather":"晴","temp":"2","img":"0"},{"time":"15:00","weather":"晴","temp":"3","img":"0"},{"time":"16:00","weather":"晴","temp":"3","img":"0"},{"time":"17:00","weather":"晴","temp":"3","img":"0"},{"time":"18:00","weather":"晴","temp":"1","img":"0"},{"time":"19:00","weather":"晴","temp":"0","img":"0"},{"time":"20:00","weather":"晴","temp":"-2","img":"0"},{"time":"21:00","weather":"晴","temp":"-2","img":"0"},{"time":"22:00","weather":"晴","temp":"-3","img":"0"},{"time":"23:00","weather":"晴","temp":"-3","img":"0"},{"time":"0:00","weather":"晴","temp":"-3","img":"0"},{"time":"1:00","weather":"晴","temp":"-4","img":"0"},{"time":"2:00","weather":"晴","temp":"-5","img":"0"},{"time":"3:00","weather":"晴","temp":"-5","img":"0"},{"time":"4:00","weather":"晴","temp":"-5","img":"0"},{"time":"5:00","weather":"晴","temp":"-6","img":"0"},{"time":"6:00","weather":"晴","temp":"-4","img":"0"},{"time":"7:00","weather":"晴","temp":"-4","img":"0"},{"time":"8:00","weather":"晴","temp":"-4","img":"0"},{"time":"9:00","weather":"晴","temp":"-2","img":"0"}]}
     */

    private int status;
    private String msg;
    private ResultBean result;

    @NoArgsConstructor
    @Data
    public static class ResultBean {
        /**
         * city : 西青区
         * cityid : 2919
         * citycode : 101030500
         * date : 2021-01-29
         * week : 星期五
         * weather : 晴
         * temp : -2
         * temphigh : 3
         * templow : -6
         * img : 0
         * humidity : 33
         * pressure : 1024
         * windspeed : 3.7
         * winddirect : 南风
         * windpower : 2级
         * updatetime : 2021-01-29 10:20:00
         * index : [{"iname":"空调指数","ivalue":"开启制暖空调","detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。"},{"iname":"运动指数","ivalue":"较不宜","detail":"天气较好，但考虑天气寒冷，推荐您进行室内运动，户外运动时请注意保暖并做好准备活动。"},{"iname":"紫外线指数","ivalue":"弱","detail":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"},{"iname":"感冒指数","ivalue":"较易发","detail":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"},{"iname":"洗车指数","ivalue":"较适宜","detail":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"iname":"空气污染扩散指数","ivalue":"较差","detail":"气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。"},{"iname":"穿衣指数","ivalue":"冷","detail":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"}]
         * aqi : {"so2":"15","so224":"7","no2":"61","no224":"40","co":"0.970","co24":"0.510","o3":"15","o38":"16","o324":"21","pm10":"72","pm1024":"47","pm2_5":"25","pm2_524":"13","iso2":"6","ino2":"31","ico":"10","io3":"5","io38":"9","ipm10":"62","ipm2_5":"36","aqi":"62","primarypollutant":"PM10","quality":"良","timepoint":"2021-01-29 09:00:00","aqiinfo":{"level":"二级","color":"#FFFF00","affect":"空气质量可接受，但某些污染物可能对极少数异常敏感人群健康有较弱影响","measure":"极少数异常敏感人群应减少户外活动"}}
         * daily : [{"date":"2021-01-29","week":"星期五","sunrise":"07:23","sunset":"17:28","night":{"weather":"晴","templow":"-6","img":"0","winddirect":"北风","windpower":"微风"},"day":{"weather":"晴","temphigh":"3","img":"0","winddirect":"东南风","windpower":"微风"}},{"date":"2021-01-30","week":"星期六","sunrise":"07:22","sunset":"17:30","night":{"weather":"晴","templow":"-6","img":"0","winddirect":"东风","windpower":"3-5级"},"day":{"weather":"晴","temphigh":"7","img":"0","winddirect":"东南风","windpower":"微风"}},{"date":"2021-01-31","week":"星期日","sunrise":"07:21","sunset":"17:31","night":{"weather":"多云","templow":"-4","img":"1","winddirect":"北风","windpower":"4-5级"},"day":{"weather":"多云","temphigh":"4","img":"1","winddirect":"西南风","windpower":"微风"}},{"date":"2021-02-01","week":"星期一","sunrise":"07:20","sunset":"17:32","night":{"weather":"晴","templow":"-8","img":"0","winddirect":"北风","windpower":"微风"},"day":{"weather":"晴","temphigh":"3","img":"0","winddirect":"北风","windpower":"4-5级"}},{"date":"2021-02-02","week":"星期二","sunrise":"07:19","sunset":"17:33","night":{"weather":"多云","templow":"-7","img":"1","winddirect":"西南风","windpower":"3-5级"},"day":{"weather":"晴","temphigh":"4","img":"0","winddirect":"西南风","windpower":"3-5级"}},{"date":"2021-02-03","week":"星期三","sunrise":"07:18","sunset":"17:34","night":{"weather":"晴","templow":"-8","img":"0","winddirect":"东风","windpower":"微风"},"day":{"weather":"多云","temphigh":"3","img":"1","winddirect":"北风","windpower":"3-5级"}},{"date":"2021-02-04","week":"星期四","sunrise":"07:17","sunset":"17:35","night":{"weather":"晴","templow":"-7","img":"0","winddirect":"西北风","windpower":"微风"},"day":{"weather":"晴","temphigh":"5","img":"0","winddirect":"西北风","windpower":"微风"}}]
         * hourly : [{"time":"10:00","weather":"晴","temp":"-5","img":"0"},{"time":"11:00","weather":"晴","temp":"-4","img":"0"},{"time":"12:00","weather":"晴","temp":"-1","img":"0"},{"time":"13:00","weather":"晴","temp":"1","img":"0"},{"time":"14:00","weather":"晴","temp":"2","img":"0"},{"time":"15:00","weather":"晴","temp":"3","img":"0"},{"time":"16:00","weather":"晴","temp":"3","img":"0"},{"time":"17:00","weather":"晴","temp":"3","img":"0"},{"time":"18:00","weather":"晴","temp":"1","img":"0"},{"time":"19:00","weather":"晴","temp":"0","img":"0"},{"time":"20:00","weather":"晴","temp":"-2","img":"0"},{"time":"21:00","weather":"晴","temp":"-2","img":"0"},{"time":"22:00","weather":"晴","temp":"-3","img":"0"},{"time":"23:00","weather":"晴","temp":"-3","img":"0"},{"time":"0:00","weather":"晴","temp":"-3","img":"0"},{"time":"1:00","weather":"晴","temp":"-4","img":"0"},{"time":"2:00","weather":"晴","temp":"-5","img":"0"},{"time":"3:00","weather":"晴","temp":"-5","img":"0"},{"time":"4:00","weather":"晴","temp":"-5","img":"0"},{"time":"5:00","weather":"晴","temp":"-6","img":"0"},{"time":"6:00","weather":"晴","temp":"-4","img":"0"},{"time":"7:00","weather":"晴","temp":"-4","img":"0"},{"time":"8:00","weather":"晴","temp":"-4","img":"0"},{"time":"9:00","weather":"晴","temp":"-2","img":"0"}]
         */

        private String city;
        private int cityid;
        private String citycode;
        private String date;
        private String week;
        private String weather;
        private String temp;
        private String temphigh;
        private String templow;
        private String img;
        private String humidity;
        private String pressure;
        private String windspeed;
        private String winddirect;
        private String windpower;
        private String updatetime;
        private AqiBean aqi;
        private List<IndexBean> index;
        private List<DailyBean> daily;
        private List<HourlyBean> hourly;

        @NoArgsConstructor
        @Data
        public static class AqiBean {
            /**
             * so2 : 15
             * so224 : 7
             * no2 : 61
             * no224 : 40
             * co : 0.970
             * co24 : 0.510
             * o3 : 15
             * o38 : 16
             * o324 : 21
             * pm10 : 72
             * pm1024 : 47
             * pm2_5 : 25
             * pm2_524 : 13
             * iso2 : 6
             * ino2 : 31
             * ico : 10
             * io3 : 5
             * io38 : 9
             * ipm10 : 62
             * ipm2_5 : 36
             * aqi : 62
             * primarypollutant : PM10
             * quality : 良
             * timepoint : 2021-01-29 09:00:00
             * aqiinfo : {"level":"二级","color":"#FFFF00","affect":"空气质量可接受，但某些污染物可能对极少数异常敏感人群健康有较弱影响","measure":"极少数异常敏感人群应减少户外活动"}
             */

            private String so2;
            private String so224;
            private String no2;
            private String no224;
            private String co;
            private String co24;
            private String o3;
            private String o38;
            private String o324;
            private String pm10;
            private String pm1024;
            private String pm2_5;
            private String pm2_524;
            private String iso2;
            private String ino2;
            private String ico;
            private String io3;
            private String io38;
            private String ipm10;
            private String ipm2_5;
            private String aqi;
            private String primarypollutant;
            private String quality;
            private String timepoint;
            private AqiinfoBean aqiinfo;

            @NoArgsConstructor
            @Data
            public static class AqiinfoBean {
                /**
                 * level : 二级
                 * color : #FFFF00
                 * affect : 空气质量可接受，但某些污染物可能对极少数异常敏感人群健康有较弱影响
                 * measure : 极少数异常敏感人群应减少户外活动
                 */

                private String level;
                private String color;
                private String affect;
                private String measure;
            }
        }

        @NoArgsConstructor
        @Data
        public static class IndexBean {
            /**
             * iname : 空调指数
             * ivalue : 开启制暖空调
             * detail : 您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。
             */

            private String iname;
            private String ivalue;
            private String detail;
        }

        @NoArgsConstructor
        @Data
        public static class DailyBean {
            /**
             * date : 2021-01-29
             * week : 星期五
             * sunrise : 07:23
             * sunset : 17:28
             * night : {"weather":"晴","templow":"-6","img":"0","winddirect":"北风","windpower":"微风"}
             * day : {"weather":"晴","temphigh":"3","img":"0","winddirect":"东南风","windpower":"微风"}
             */

            private String date;
            private String week;
            private String sunrise;
            private String sunset;
            private NightBean night;
            private DayBean day;

            @NoArgsConstructor
            @Data
            public static class NightBean {
                /**
                 * weather : 晴
                 * templow : -6
                 * img : 0
                 * winddirect : 北风
                 * windpower : 微风
                 */

                private String weather;
                private String templow;
                private String img;
                private String winddirect;
                private String windpower;
            }

            @NoArgsConstructor
            @Data
            public static class DayBean {
                /**
                 * weather : 晴
                 * temphigh : 3
                 * img : 0
                 * winddirect : 东南风
                 * windpower : 微风
                 */

                private String weather;
                private String temphigh;
                private String img;
                private String winddirect;
                private String windpower;
            }
        }

        @NoArgsConstructor
        @Data
        public static class HourlyBean {
            /**
             * time : 10:00
             * weather : 晴
             * temp : -5
             * img : 0
             */

            private String time;
            private String weather;
            private String temp;
            private String img;
        }
    }
}
