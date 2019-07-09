package com.quartz.jialei.weather;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Weather {

    /**
     * cityid : 101010200
     * update_time : 2019-07-04 07:30:00
     * city : 海淀
     * cityEn : haidian
     * country : 中国
     * countryEn : China
     * data : [{"day":"4日（今天）","date":"2019-07-04","week":"星期四","wea":"晴转多云","wea_img":"yun","air":0,"humidity":52,"air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"tem1":"39℃","tem2":"25℃","tem":"29℃","win":["南风","南风"],"win_speed":"3-4级转<3级","hours":[{"day":"04日08时","wea":"晴","tem":"29℃","win":"南风","win_speed":"<3级"},{"day":"04日11时","wea":"晴","tem":"35℃","win":"南风","win_speed":"<3级"},{"day":"04日14时","wea":"晴","tem":"38℃","win":"南风","win_speed":"3-4级"},{"day":"04日17时","wea":"晴","tem":"37℃","win":"南风","win_speed":"3-4级"},{"day":"04日20时","wea":"晴","tem":"32℃","win":"南风","win_speed":"<3级"},{"day":"04日23时","wea":"多云","tem":"29℃","win":"南风","win_speed":"<3级"},{"day":"05日02时","wea":"多云","tem":"26℃","win":"南风","win_speed":"<3级"},{"day":"05日05时","wea":"多云","tem":"25℃","win":"南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"强","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天热风大，可选择低强度运动。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温高，血糖易波动，注意防暑降温。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]},{"day":"5日（明天）","date":"2019-07-05","week":"星期五","wea":"雷阵雨","wea_img":"lei","tem1":"34℃","tem2":"22℃","tem":"27℃","win":["东风","北风"],"win_speed":"<3级转3-4级","hours":[{"day":"05日08时","wea":"多云","tem":"27℃","win":"南风","win_speed":"<3级"},{"day":"05日11时","wea":"雷阵雨","tem":"30℃","win":"东风","win_speed":"<3级"},{"day":"05日14时","wea":"雷阵雨","tem":"32℃","win":"东风","win_speed":"<3级"},{"day":"05日17时","wea":"雷阵雨","tem":"31℃","win":"东风","win_speed":"<3级"},{"day":"05日20时","wea":"雷阵雨","tem":"27℃","win":"东风","win_speed":"<3级"},{"day":"05日23时","wea":"阴","tem":"25℃","win":"北风","win_speed":"<3级"},{"day":"06日02时","wea":"雷阵雨","tem":"24℃","win":"北风","win_speed":"<3级"},{"day":"06日05时","wea":"雷阵雨","tem":"23℃","win":"北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气闷热，坚持室内低强度运动。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温多变，血糖易波动，请注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"较适宜","desc":"无雨且风力较小，易保持清洁度。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]},{"day":"6日（后天）","date":"2019-07-06","week":"星期六","wea":"雷阵雨","wea_img":"lei","tem1":"31℃","tem2":"20℃","tem":"24℃","win":["北风","北风"],"win_speed":"<3级","hours":[{"day":"06日08时","wea":"雷阵雨","tem":"24℃","win":"北风","win_speed":"3-4级"},{"day":"06日11时","wea":"雷阵雨","tem":"28℃","win":"北风","win_speed":"<3级"},{"day":"06日14时","wea":"多云","tem":"30℃","win":"北风","win_speed":"<3级"},{"day":"06日17时","wea":"多云","tem":"28℃","win":"北风","win_speed":"<3级"},{"day":"06日20时","wea":"晴","tem":"26℃","win":"北风","win_speed":"<3级"},{"day":"06日23时","wea":"晴","tem":"24℃","win":"北风","win_speed":"<3级"},{"day":"07日02时","wea":"晴","tem":"24℃","win":"北风","win_speed":"<3级"},{"day":"07日05时","wea":"晴","tem":"22℃","win":"北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"辐射弱，涂擦SPF8-12防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"夏天肉难藏，雨天坚持室内运动吧。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]},{"day":"7日（周日）","date":"2019-07-07","week":"星期日","wea":"阴","wea_img":"yin","tem1":"30℃","tem2":"20℃","tem":"24℃","win":["北风","西北风"],"win_speed":"<3级","hours":[{"day":"07日08时","wea":"雷阵雨","tem":"24℃","win":"北风","win_speed":"<3级"},{"day":"07日14时","wea":"阴","tem":"26℃","win":"北风","win_speed":"<3级"},{"day":"07日20时","wea":"阴","tem":"26℃","win":"北风","win_speed":"<3级"},{"day":"08日02时","wea":"阴","tem":"22℃","win":"西北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"辐射较弱，涂擦SPF12-15、PA+护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"较差","desc":"气象条件较不利于空气污染物扩散。。"}]},{"day":"8日（周一）","date":"2019-07-08","week":"星期一","wea":"多云","wea_img":"yun","tem1":"31℃","tem2":"21℃","tem":"23℃","win":["北风","北风"],"win_speed":"<3级","hours":[{"day":"08日08时","wea":"多云","tem":"23℃","win":"西北风","win_speed":"<3级"},{"day":"08日14时","wea":"多云","tem":"28℃","win":"北风","win_speed":"<3级"},{"day":"08日20时","wea":"多云","tem":"27℃","win":"北风","win_speed":"<3级"},{"day":"09日02时","wea":"晴","tem":"23℃","win":"北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"热","desc":"适合穿T恤、短薄外套等夏季服装。"},{"title":"洗车指数","level":"较不宜","desc":"路面有积水，车子易被溅上泥水。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"9日（周二）","date":"2019-07-09","week":"星期二","wea":"多云","wea_img":"yun","tem1":"32℃","tem2":"21℃","tem":"24℃","win":["北风","东南风"],"win_speed":"<3级","hours":[{"day":"09日08时","wea":"多云","tem":"24℃","win":"北风","win_speed":"<3级"},{"day":"09日14时","wea":"多云","tem":"29℃","win":"北风","win_speed":"<3级"},{"day":"09日20时","wea":"多云","tem":"27℃","win":"北风","win_speed":"<3级"},{"day":"10日02时","wea":"晴","tem":"23℃","win":"东南风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"适宜","desc":"天气较好，适合擦洗汽车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]},{"day":"10日（周三）","date":"2019-07-10","week":"星期三","wea":"多云","wea_img":"yun","tem1":"32℃","tem2":"22℃","tem":"23℃","win":["南风","北风"],"win_speed":"<3级","hours":[{"day":"10日08时","wea":"多云","tem":"23℃","win":"东南风","win_speed":"<3级"},{"day":"10日14时","wea":"多云","tem":"29℃","win":"南风","win_speed":"<3级"},{"day":"10日20时","wea":"多云","tem":"28℃","win":"南风","win_speed":"<3级"},{"day":"11日02时","wea":"多云","tem":"24℃","win":"北风","win_speed":"<3级"}],"index":[{"title":"紫外线指数","level":"中等","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天气有点热，运动多补水。"},{"title":"健臻·血糖指数","level":"易波动","desc":"血糖易波动，注意监测。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"适宜","desc":"天气较好，适合擦洗汽车。"},{"title":"空气污染扩散指数","level":"中","desc":"易感人群应适当减少室外活动。"}]}]
     */

    private String cityid;
    private String update_time;
    private String city;
    private String cityEn;
    private String country;
    private String countryEn;
    private List<DataBean> data;
    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * day : 4日（今天）
         * date : 2019-07-04
         * week : 星期四
         * wea : 晴转多云
         * wea_img : yun
         * air : 0
         * humidity : 52
         * air_level : 优
         * air_tips : 空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！
         * alarm : {"alarm_type":"","alarm_level":"","alarm_content":""}
         * tem1 : 39℃
         * tem2 : 25℃
         * tem : 29℃
         * win : ["南风","南风"]
         * win_speed : 3-4级转<3级
         * hours : [{"day":"04日08时","wea":"晴","tem":"29℃","win":"南风","win_speed":"<3级"},{"day":"04日11时","wea":"晴","tem":"35℃","win":"南风","win_speed":"<3级"},{"day":"04日14时","wea":"晴","tem":"38℃","win":"南风","win_speed":"3-4级"},{"day":"04日17时","wea":"晴","tem":"37℃","win":"南风","win_speed":"3-4级"},{"day":"04日20时","wea":"晴","tem":"32℃","win":"南风","win_speed":"<3级"},{"day":"04日23时","wea":"多云","tem":"29℃","win":"南风","win_speed":"<3级"},{"day":"05日02时","wea":"多云","tem":"26℃","win":"南风","win_speed":"<3级"},{"day":"05日05时","wea":"多云","tem":"25℃","win":"南风","win_speed":"<3级"}]
         * index : [{"title":"紫外线指数","level":"强","desc":"涂擦SPF大于15、PA+防晒护肤品。"},{"title":"<\/em><em><\/em><em><\/em><em>","level":null,"desc":"天热风大，可选择低强度运动。"},{"title":"健臻·血糖指数","level":"易波动","desc":"气温高，血糖易波动，注意防暑降温。"},{"title":"穿衣指数","level":"炎热","desc":"建议穿短衫、短裤等清凉夏季服装。"},{"title":"洗车指数","level":"不宜","desc":"有雨，雨水和泥水会弄脏爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物扩散。"}]
         */

        private String day;
        private String date;
        private String week;
        private String wea;
        private String wea_img;
        private int air;
        private int humidity;
        private String air_level;
        private String air_tips;
        private AlarmBean alarm;
        private String tem1;
        private String tem2;
        private String tem;
        private String win_speed;
        private List<String> win;
        private List<HoursBean> hours;
        private List<IndexBean> index;

        @NoArgsConstructor
        @Data
        public static class AlarmBean {
            /**
             * alarm_type :
             * alarm_level :
             * alarm_content :
             */

            private String alarm_type;
            private String alarm_level;
            private String alarm_content;
        }

        @NoArgsConstructor
        @Data
        public static class HoursBean {
            /**
             * day : 04日08时
             * wea : 晴
             * tem : 29℃
             * win : 南风
             * win_speed : <3级
             */

            private String day;
            private String wea;
            private String tem;
            private String win;
            private String win_speed;
        }

        @NoArgsConstructor
        @Data
        public static class IndexBean {
            /**
             * title : 紫外线指数
             * level : 强
             * desc : 涂擦SPF大于15、PA+防晒护肤品。
             */

            private String title;
            private String level;
            private String desc;
        }
    }

}
