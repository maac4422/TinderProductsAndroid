package co.com.maac.tinderproducts.Toothpick

object DI {
    //single scopes
    const val APP_SCOPE = "app scope"
    const val SERVER_SCOPE = "server scope"
    const val DRAWER_FLOW_SCOPE = "drawer flow scope"
    const val AUTH_FLOW_SCOPE = "auth flow scope"

    //multi scopes
    const val USER_FLOW_SCOPE = "user flow scope: "
    const val PROJECT_FLOW_SCOPE = "project flow scope: "
    const val MERGE_REQUEST_FLOW_SCOPE = "merge request flow scope: "
    const val ISSUE_FLOW_SCOPE = "issue flow scope: "
}