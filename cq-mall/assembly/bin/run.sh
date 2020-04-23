cd `dirname $0`
cd ..
DEPLOY_DIR=`pwd`

STDOUT_FILE=$DEPLOY_DIR/stdout.log
LIB_DIR=$DEPLOY_DIR/lib/*
CONF_DIR=$DEPLOY_DIR/conf/
#LIB_JARS=`ls $LIB_DIR|grep .jar|awk '{print "'$LIB_DIR'/"$0}'|tr "\n" ":"`

echo $LIB_JARS
echo $STDOUT_FILE

java -classpath $CONF_DIR:$LIB_DIR club.banyuan.demo.deploy.DemoApplication > $STDOUT_FILE 2>&1 &
echo "RUN SUCCESS!"

