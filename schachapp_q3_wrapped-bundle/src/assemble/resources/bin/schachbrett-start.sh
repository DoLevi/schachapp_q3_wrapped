SET APP_DIR=%~dp0..

cd $APP_DIR
java -jar -Djava.class.path=lib/* lib/schachapp_q3_wrapped-core-localbuild.jar