1、 val lines = sc.textFile("README.md") // 创建名为lines的RDD
2、 lines.count()   //统计RDD中的元素数
3、 lines.first()   //RDD的第一个元素
4、 val pythonLines = lines.filter(line => line.contains("Python")) //文本筛选
5、 sc.stop()       //关闭Spark
6、 newRdd.persist() //持久化
7、 val lines = sc.parallelize(List("pandas", "i like pandas")) //通过sc.parallelize()方法创建RDD
8、 rdd.take(n)      //取rdd的前n个元素，返回值为一个列表
9、 rdd.collect()    //返回rdd中的所有元素构成一个列表
10、 val nums = sc.parallelize(List(1,2,3,4))  //通过SparkContext对象sc的parallelize方法将List转化为rdd
11、 val nums_sq = nums.map(x => x*x) // 转化操作rdd.map方法将rdd中的每个元素应用map中的方法进行映射，得到
    //新的rdd
12、 val words = sc.parallelize(List("Hello world", "Hi", "Ni hao")).flatMap(x => x.split(" "))
    // rdd.flatMap方法将rdd中的元素应用于flatMap中的函数，每个元素对应不确定个数的结果
13、 rdd.distinct()          //去重操作
14、 rdd1.union(rdd2)        //合并rdd1和rdd2
15、 rdd1.intersection(rdd2) //返回rdd1和rdd2中共有的、去重后的元素
16、 rdd1.subtract(rdd2)     //返回rdd1中不包含rdd2中任何元素的元素组成的RDD
17、 rdd1.cartesian(rdd2)    //返回rdd1和rdd2中的元素构成的二元元组所组成的笛卡尔积
18、 rdd.sample(withReplacement, fraction, [seed]) //转化操作，withReplacement取值为布尔型，从rdd中有放回地
    //（当withReplacement为true时, 否则为无放回）取比重约为0.5的样本来构成新的rdd
19、 rdd.reduce( func(x,y) ) //行动操作。reduce中的参数func为函数，该函数作用于rdd中两个元素，返回元素类型
    // 相同的结果，并将该结果作为func的一个参数，rdd中从生下的元素中再取一个作为func的另一个参数，以此类推
20、 rdd.fold(zero_value)( func(x, y) ) //fold首先接受一个与rdd中的元素类型相同的零值，该初始值对最终结果不会有影响
21、 rdd.aggregate(zero_value)(seqOp, combOp) // 见案例
22、 rdd.top(n)  //返回rdd中最前面的n个元素
23、 rdd.takeSample(withReplacement, num, [seed]) // 行动操作从rdd中有放回（withReplacement=tre, 否则为无放回）
    // 地抽取num个元素
24、 rdd.countByValue() //行动操作， 统计rdd中不同元素出现的次数
25、 prdd.reduceByKey(func) //先将prdd按照键key进行分组，再讲结果分别应用func函数进行reduce（归约）
26、 prdd.groupByKey()  // 对具有相同键的值进行分组
27、 prdd.mapValues(func) // 对rdd中的每个元素的value应用func，而不改变键
28、 prdd.flatMapValues(func) // 见教材P43
29、 prdd.keys            // 返回prdd中的键组成的rdd
30、 prdd.values          // 返回prdd中的值组成的rdd
31、 prdd.sortByKey(ascending = true)     // 返回一个根据键排列第rdd, ascending默认为true
32、 prdd1.subtractByKey(prdd2)  // 删除prdd1中键与prdd2中的键相同的元素
33、 （1）prdd1.join(prdd2)    // 对prdd1和prdd2进行内连接
    （2）prdd1.rightOuterJoin(prdd2)  //右连接
    （3）prdd1.leftOuterJoin(prdd2) //左连接
34、 prdd1.cogroup(prdd2)  //见教材P44
35、 prdd.filter{case (key, value) => condition }
36、 prdd.mapValues(func) //相当于prdd.map{case (key, value) => (key, func(value))}
37、 prdd.foldByKey(zero_value)((x, y) => func(x, y))
38、 rdd.partitions.size //查看分区数
39、 prdd.countByKey() // 行动操作，对每个键对应的每个元素分别计数，返回结果为Map的形式
40、 prdd.loockup(key) //返回指定的键对应的值
41、 （1）DF.rdd // DataFrame转化为RDD
    （2）rdd.toDF(colNames = c1, c2, ...) //rdd转化为DataFrame；
42、 DF.count() //统计DF中的记录数；
43、 DS.columns //返回Dataset DS的列（以数组的方式）； 
44、 DS.select(col_name) // 返回DS的列col_name,其格式仍为Dataset;
45、 







