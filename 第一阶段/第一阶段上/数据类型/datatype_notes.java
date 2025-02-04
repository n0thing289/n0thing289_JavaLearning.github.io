/*
 *数据类型
 *     基本数据类型（八大基本数据类型）
 *         数值型
 *             整数类型：byte short int long
 *             浮点类型：float double
 *         字符型
 *             char
 *             boolean
 *     引用数据类型
 *         类（class）
 *         接口（interface）-面向对象高级再讲
 *         数组（）
 *         String
 *     整型
 *    	  byte n1 = 10;  // 1个字节 why存放范围（下面的同理，但范围不一） -128-127？ --》二进制时细讲
 *        short n2 = 10;  // 2个字节（2 byte）
 *        int n3 = 10;  // 4个字节  都是10但是占用的内存空间不同
 *        long // 8个字节
 * 
 *        整型细节
 *            1. 各整数类型有固定的范围和字段长度，不受os的影响
 *            2. java整型默认为int值，声明long型常量量后加l或L
 *                int n2 = 1L; //错误！
 *                long n2 = 1L; // 对
 *            3. java程序中变量常声明int型，除非不足以表示大数才使用long（保小不保大）
 *            4. bit 计算机中最小的存储单位。 byte 计算机中基本存储单元 1byte（一字节） = 8bit
 *                byte n1 = 3; short n2 = 3; //其内存中存在形式图
 *                一个字节一个byte 8个bit，一个bit一格保存0或者1
 *
*       浮点类型
*          浮点数=符号位+指数位+尾数位
 *                 
 *            
 */