package club.banyuan.cqmall.constant;

public interface CacheKey {

    String BASE="mall";

    String SEPARATOR="::";

    String USER_INFO=BASE+SEPARATOR+"info";

    String USER_ENTITY=BASE+SEPARATOR+"entity";

    String RESOURCE_LIST=BASE+SEPARATOR+"resource";

    String MENU_LIST=BASE+SEPARATOR+"menu";

    String MEMBER_LIST=BASE+SEPARATOR+"member";

    String PRODUCT_CATEGORY_LIST=BASE+SEPARATOR+"productCategory";

    String SUBJECT_LIST=BASE+SEPARATOR+"subject";

    String CACHE_KEY_ALL="all";

    String CACHE_KEY_WITHCHILDREN="withChildren";
}
