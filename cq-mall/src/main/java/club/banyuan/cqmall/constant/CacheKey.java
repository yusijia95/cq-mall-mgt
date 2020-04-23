package club.banyuan.cqmall.constant;

public interface CacheKey {

    String BASE="mall";

    String SEPARATOR="::";

    String USER_INFO=BASE+SEPARATOR+"info";

    String USER_ENTITY=BASE+SEPARATOR+"entity";

    String RESOURCE_LIST=BASE+SEPARATOR+"resource";

    String MENU_LIST=BASE+SEPARATOR+"menu";

    String CACHE_KEY="all";
}
