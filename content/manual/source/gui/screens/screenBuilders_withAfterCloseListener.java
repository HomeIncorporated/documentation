@Inject
private ScreenBuilders screenBuilders;
@Inject
private Notifications notifications;

private void openOtherScreen() {
    screenBuilders.screen(this)
            .withScreenClass(OtherScreen.class)
            .withAfterCloseListener(e -> {
                notifications.create().withCaption("Closed").show();
            })
            .build()
            .show();
}
