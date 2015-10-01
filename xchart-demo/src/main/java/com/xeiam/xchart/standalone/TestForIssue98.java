/**
 * Copyright 2013 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xchart.standalone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import com.xeiam.xchart.Chart;
import com.xeiam.xchart.StyleManager;
import com.xeiam.xchart.StyleManager.LegendPosition;
import com.xeiam.xchart.SwingWrapper;

/**
 * @author timmolter
 */
public class TestForIssue98 {

  public static void main(String[] args) throws IOException {

    final Chart chart = new Chart(1920, 1080);
    StyleManager manager = chart.getStyleManager();
    manager.setLegendPosition(LegendPosition.InsideNW);
    manager.setYAxisLogarithmic(true);

    final double[] vals = { 1000.0, 1011.2756666666667, 1011.2176666666667, 1010.9306666666666, 1010.8726666666666, 1020.4256666666668, 1020.051, 1019.993, 1044.9753333333333, 1046.7806666666665,
        1046.7226666666666, 1046.4189999999999, 1046.351, 1050.153, 1049.7366666666667, 1049.5720000000001, 1076.0839999999998, 1075.9203333333332, 1072.3443333333335, 1072.1806666666666,
        1071.9886666666666, 1071.824, 1071.42, 960.1533333333334, 959.5923333333334, 959.2996666666667, 959.1426666666666, 959.0046666666667, 955.6723333333334, 955.183, 954.8903333333333,
        954.7333333333333, 954.6003333333333, 963.2423333333334, 975.7539999999999, 1001.1123333333333, 1023.4456666666667, 1006.2573333333333, 1005.771, 1015.633, 1028.1663333333333,
        1028.1043333333332, 1027.809, 1027.741, 1038.212, 1051.3436666666666, 978.3113333333333, 977.905, 1003.2906666666667, 1003.2326666666667, 1013.0886666666667, 1025.592, 1025.4416666666666,
        1052.5756666666666, 1052.4119999999998, 1057.9143333333334, 1057.7496666666666, 1057.5576666666666, 1057.393, 1085.7983333333332, 1085.6346666666668, 1115.3433333333332, 1108.9850000000001,
        1108.5486666666666, 1134.5343333333333, 1134.359, 1174.7926666666667, 1174.6039999999998, 1150.874, 1150.6846666666665, 1150.4776666666667, 1150.2883333333334, 1178.2469999999998,
        1168.3136666666667, 1167.6680000000001, 1167.324, 1167.117, 1102.2586666666666, 1039.1013333333333, 1038.652, 967.1510000000001, 944.079, 943.8756666666666, 943.7723333333333,
        943.5863333333334, 953.2123333333334, 965.2956666666666, 965.1096666666667, 988.8873333333333, 979.981, 979.6063333333334, 1002.9306666666666, 1002.8726666666666, 1002.569, 1012.231, 1043.37,
        1036.2066666666667, 1035.8953333333334, 1035.8233333333333, 1035.7603333333334, 976.5866666666667, 921.9079999999999, 921.5183333333333, 904.1596666666667, 904.035, 903.8779999999999,
        903.8299999999999, 923.2616666666667, 931.5886666666667, 931.5356666666667, 926.365, 926.069, 925.9343333333334, 925.6323333333333, 911.302, 910.8533333333332, 910.7733333333333,
        910.6673333333333, 910.4103333333333, 930.4780000000001, 939.6479999999999, 950.6279999999999, 950.284, 907.885, 907.7123333333334, 907.6173333333334, 915.9603333333333, 928.0053333333333,
        927.9523333333334, 948.621, 948.563, 932.2950000000001, 932.1173333333334, 932.0223333333333, 942.303, 942.1253333333334, 942.0303333333334, 941.8526666666667, 892.5393333333334,
        892.4146666666667, 845.9303333333334, 836.8453333333333, 836.5203333333334, 836.2833333333333, 836.1563333333334, 836.05, 854.1569999999999, 871.7223333333334, 878.9573333333333,
        878.5626666666667, 878.4826666666667, 878.3766666666667, 886.6836666666667, 897.5070000000001, 897.4590000000001, 852.96, 825.7466666666667, 825.572, 825.515, 825.4136666666666, 825.213,
        824.425, 823.8863333333334, 823.7850000000001, 845.6823333333334, 845.581, 845.4523333333333, 853.2683333333333, 863.185, 853.6243333333334, 853.3399999999999, 853.098, 852.971,
        853.7296666666666, 853.4313333333333, 842.5066666666667, 842.4003333333334, 842.2733333333333, 850.0083333333334, 859.9300000000001, 859.8236666666667, 872.124, 872.076, 871.8523333333333,
        871.8043333333333, 880.3383333333334, 890.3033333333333, 890.2553333333333, 879.5313333333334, 879.4833333333333, 879.2513333333334, 903.06, 903.012, 902.7716666666666, 872.6686666666667,
        872.6206666666667, 872.3820000000001, 872.3340000000001, 872.2033333333334, 893.8330000000001, 893.5263333333334, 893.3966666666668, 893.0906666666667, 913.3136666666667, 895.8443333333333,
        895.521, 895.3913333333334, 895.0853333333334, 875.5963333333333, 875.2729999999999, 875.0943333333333, 883.4333333333334, 894.3183333333334, 894.2703333333334, 873.4303333333334,
        873.3823333333333, 873.1586666666667, 873.1106666666667, 891.4123333333333, 891.3643333333333, 909.9556666666667, 903.2476666666666, 903.1996666666666, 902.9493333333334, 902.9013333333334,
        902.748, 905.739, 905.4000000000001, 905.2703333333334, 904.9593333333333, 904.9063333333334, 924.8563333333334, 922.106, 921.653, 921.3786666666667, 921.2166666666667, 942.0233333333333,
        929.362, 929.0146666666667, 928.8286666666667, 950.219, 926.499, 926.313, 926.218, 926.037, 935.549, 931.8346666666666, 931.4666666666667, 931.3420000000001, 882.4713333333333,
        840.2733333333333, 840.162, 857.9526666666667, 857.8413333333333, 857.7126666666667, 857.6013333333333, 868.6953333333333, 868.3969999999999, 886.7443333333333, 886.6246666666666,
        886.4626666666667, 882.0706666666667, 881.903, 881.808, 881.76, 881.5213333333334, 881.3193333333334, 899.7246666666666, 892.202, 891.7683333333333, 875.818, 875.6553333333334,
        875.5603333333333, 894.3706666666667, 894.3226666666667, 883.3873333333333, 883.2963333333335, 883.1063333333334, 883.0583333333334, 901.9533333333334, 910.0173333333333, 921.509,
        921.1716666666666, 895.423, 895.237, 895.142, 894.966, 903.4639999999999, 915.2373333333333, 915.0563333333333, 938.144, 947.5073333333333, 947.3263333333334, 947.2313333333334,
        947.0453333333334, 967.7750000000001, 967.637, 988.2513333333334, 1005.309, 1005.251, 1004.9556666666666, 1004.8876666666666, 1004.738, 1004.4226666666667, 988.5020000000001,
        987.9593333333333, 1010.7533333333333, 1010.55, 1010.455, 1010.397, 981.7636666666667, 981.3706666666667, 981.2326666666667, 980.9083333333333, 929.8093333333334, 882.8616666666667,
        882.5043333333333, 877.172, 877.0043333333333, 876.9093333333333, 876.8613333333333, 895.9656666666667, 883.1846666666667, 883.1366666666667, 882.8896666666667, 882.8416666666667, 882.76,
        882.4143333333334, 900.89, 901.761, 901.3396666666667, 901.009, 921.3843333333334, 921.2033333333334, 929.1926666666667, 929.0116666666668, 928.9166666666667, 928.7306666666667,
        944.4926666666667, 944.1179999999999, 943.937, 943.6846666666667, 945.6313333333333, 945.2606666666667, 945.0746666666666, 944.8223333333333, 954.1863333333333, 965.8213333333333,
        965.6883333333333, 986.7763333333334, 969.5906666666666, 969.22, 960.201, 960.0630000000001, 959.896, 959.758, 949.3096666666667, 948.8103333333333, 948.4696666666666, 948.3746666666666,
        952.2166666666667, 951.842, 951.656, 942.1283333333333, 941.9423333333334, 941.8473333333334, 941.6613333333333, 941.233, 907.6756666666666, 907.1853333333333, 906.863, 906.768,
        836.7793333333334, 836.4403333333333, 836.2083333333333, 836.0813333333333, 853.55, 831.1616666666666, 830.8773333333334, 830.6453333333334, 830.5183333333333, 830.417, 839.023, 838.644,
        838.5640000000001, 838.4046666666667, 838.2776666666666, 838.1763333333333, 845.7063333333333, 873.3776666666668, 872.7196666666666, 872.6716666666666, 894.4626666666667, 894.4146666666667,
        894.1676666666667, 904.4826666666667, 904.1593333333333, 904.1113333333333, 947.0813333333333, 947.0333333333333, 946.773, 946.715, 967.4366666666667, 967.2506666666667, 937.969, 937.783,
        937.6880000000001, 958.54, 958.354, 958.259, 970.1756666666668, 970.0376666666666, 969.8706666666667, 969.7326666666667, 969.2703333333334, 938.0266666666666, 937.5273333333334,
        937.1866666666667, 937.0916666666667, 942.8743333333334, 942.4996666666666, 942.3136666666667, 951.5666666666666, 963.1366666666667, 962.9506666666666, 939.7896666666667, 939.6036666666666,
        939.5086666666666, 939.3226666666667, 962.3613333333334, 962.1753333333334, 962.5656666666666, 962.3796666666667, 962.1936666666667, 962.107, 971.219, 983.479, 992.6759999999999,
        1004.7909999999999, 1004.4163333333333, 949.3723333333334, 949.1863333333333, 949.0913333333333, 948.9103333333334, 948.477, 974.2223333333334, 923.8556666666667, 923.4503333333332,
        922.7743333333333, 922.5983333333334, 922.5033333333333, 930.8773333333334, 942.4623333333333, 884.9406666666666, 884.628, 884.5083333333334, 906.5566666666666, 906.394, 928.3499999999999,
        897.2966666666666, 897.1256666666667, 897.0306666666668, 916.1236666666666, 915.9956666666667, 936.4266666666667, 936.2456666666667, 927.29, 927.104, 948.3223333333333, 948.1363333333334,
        948.0413333333333, 956.9723333333334, 968.3373333333334, 968.1513333333334, 988.8346666666666, 993.9546666666668, 993.8176666666667, 993.6423333333333, 1002.8943333333333, 1016.786,
        1016.6356666666666, 1040.49, 1040.2723333333333, 1039.3923333333332, 1039.1696666666667, 1064.7469999999998, 1064.5253333333333, 1064.4053333333331, 1064.1826666666666, 1088.152,
        1112.3743333333332, 1080.9446666666668, 1080.4943333333335, 1080.2676666666666, 1079.9903333333332, 1079.7636666666667, 1107.7613333333334, 1133.9333333333334, 1120.908, 1120.2973333333334,
        1119.9533333333334, 1147.2440000000001, 1147.0553333333332, 1146.8266666666666, 1157.4886666666666, 1173.2053333333333, 1200.7966666666666, 1179.3806666666667, 1178.8636666666666,
        1178.5963333333334, 1178.2939999999999, 1190.019, 1205.399, 1205.125, 1232.6363333333334, 1272.501, 1242.5213333333334, 1241.9703333333332, 1241.6796666666667, 1241.4363333333333,
        1271.7973333333334, 1301.1653333333334, 1300.5803333333333, 1234.4313333333334, 1193.0936666666666, 1192.7973333333334, 1192.6523333333334, 1204.5383333333334, 1222.1833333333334,
        1221.9053333333331, 1221.7603333333332, 1251.2066666666667, 1231.916, 1231.6246666666666, 1231.4796666666666, 1260.3926666666666, 1260.0963333333334, 1259.943, 1293.4623333333334, 1293.161,
        1245.4996666666666, 1245.0866666666666, 1244.788, 1277.8366666666666, 1277.538, 1270.1956666666665, 1269.8943333333332, 1269.7343333333333, 1272.0863333333332, 1271.6643333333332,
        1303.3553333333334, 1243.6709999999998, 1243.2516666666666, 1272.4346666666665, 1272.12, 1271.96, 1271.6346666666668, 1260.825, 1260.167, 1259.539, 1259.48, 1294.5543333333335,
        1294.1173333333334, 1367.0713333333333, 1360.838, 1360.1779999999999, 1394.2823333333333, 1393.9163333333333, 1305.6979999999999, 1305.2203333333332, 1256.1926666666668, 1255.7456666666667,
        1289.9153333333334, 1289.4773333333333, 1324.7426666666665, 1324.4, 1250.6689999999999, 1250.2126666666668, 1175.0436666666667, 1174.6256666666668, 1108.5096666666668, 1108.13,
        1136.2556666666665, 1135.9826666666668, 1169.0146666666667, 1168.7283333333335, 1199.373, 1198.9733333333334, 1228.898, 1228.4733333333334, 1265.8213333333333, 1309.2793333333334,
        1308.6236666666668, 1297.5133333333333, 1297.0596666666665, 1331.5026666666668, 1331.155, 1345.8339999999998, 1364.2673333333332, 1363.7863333333335, 1397.8653333333332, 1397.371,
        1434.2403333333334, 1433.8519999999999, 1433.662, 1478.2993333333334, 1477.7693333333332, 1518.2013333333334, 1523.7976666666668, 1523.3876666666665, 1523.181, 1576.6873333333333,
        1576.0983333333334, 1593.2533333333333, 1616.2183333333332, 1615.6036666666666, 1670.999, 1609.8566666666666, 1609.237, 1608.6086666666667, 1649.3069999999998, 1668.552, 1667.78,
        1713.7266666666667, 1678.83, 1678.4616666666666, 1678.1646666666666 };
    final long[] time = { 1363651237500L, 1363980712500L, 1364331637500L, 1364418037500L, 1364504437500L, 1364585512500L, 1364590837500L, 1365109237500L, 1365165262500L, 1365190312500L,
        1365195637500L, 1365454837500L, 1365627637500L, 1365795112500L, 1365800437500L, 1366146037500L, 1366207462500L, 1366232437500L, 1366399912500L, 1366405237500L, 1366664437500L, 1366750837500L,
        1366923637500L, 1367004712500L, 1367010037500L, 1367355637500L, 1367442037500L, 1367528437500L, 1367609512500L, 1367614837500L, 1367960437500L, 1368046837500L, 1368133237500L, 1368176362500L,
        1368176662500L, 1368189262500L, 1368192862500L, 1368214312500L, 1368219637500L, 1368555562500L, 1368557962500L, 1368565237500L, 1368651637500L, 1368738037500L, 1368771262500L, 1368771862500L,
        1368819112500L, 1368824437500L, 1369146262500L, 1369170037500L, 1369233562500L, 1369234762500L, 1369256437500L, 1369332862500L, 1369342837500L, 1369423912500L, 1369688437500L, 1369774837500L,
        1369861237500L, 1369922962500L, 1369947637500L, 1370009062500L, 1370028712500L, 1370034037500L, 1370357962500L, 1370379637500L, 1370534062500L, 1370552437500L, 1370633512500L, 1370898037500L,
        1370984437500L, 1371070837500L, 1371219562500L, 1371238312500L, 1371243637500L, 1371589237500L, 1371675637500L, 1371715762500L, 1371721162500L, 1371762037500L, 1371818062500L, 1371843112500L,
        1371848437500L, 1372107637500L, 1372194037500L, 1372297762500L, 1372298062500L, 1372366837500L, 1372431562500L, 1372447912500L, 1372453237500L, 1372766962500L, 1372798837500L, 1372885237500L,
        1372945762500L, 1373027662500L, 1373052712500L, 1373317237500L, 1373403637500L, 1373490037500L, 1373496562500L, 1373516062500L, 1373576437500L, 1373657512500L, 1373662837500L, 1373922037500L,
        1374008437500L, 1374065287500L, 1374132862500L, 1374181237500L, 1374262312500L, 1374526837500L, 1374699637500L, 1374786037500L, 1374867112500L, 1374872437500L, 1375131637500L, 1375218037500L,
        1375304437500L, 1375372762500L, 1375373587500L, 1375376362500L, 1375390837500L, 1375471912500L, 1375477237500L, 1375736437500L, 1375873687500L, 1375878862500L, 1375909237500L, 1375976662500L,
        1375995637500L, 1376076712500L, 1376427637500L, 1376600437500L, 1376681512500L, 1376686837500L, 1376946037500L, 1377032437500L, 1377131062500L, 1377205237500L, 1377231262500L, 1377286312500L,
        1377291637500L, 1377637237500L, 1377723637500L, 1377810037500L, 1377865162500L, 1377877162500L, 1377891112500L, 1377896437500L, 1378155637500L, 1378242037500L, 1378307587500L, 1378309462500L,
        1378328437500L, 1378479562500L, 1378495912500L, 1378501237500L, 1378760437500L, 1378846837500L, 1378933237500L, 1379100712500L, 1379106037500L, 1379451637500L, 1379527462500L, 1379538037500L,
        1379624437500L, 1379667862500L, 1379668462500L, 1379705512500L, 1379710837500L, 1380056437500L, 1380229237500L, 1380310312500L, 1380315637500L, 1380915112500L, 1381179637500L, 1381266037500L,
        1381320562500L, 1381320787500L, 1381352437500L, 1381519912500L, 1381525237500L, 1381870837500L, 1381957237500L, 1381993387500L, 1381994362500L, 1382043637500L, 1382124712500L, 1382130037500L,
        1382475637500L, 1382537062500L, 1382562037500L, 1382648437500L, 1382729512500L, 1382734837500L, 1383080437500L, 1383166837500L, 1383253237500L, 1383334312500L, 1383339637500L, 1383771637500L,
        1383858037500L, 1383918262500L, 1383939112500L, 1383944437500L, 1384376437500L, 1384462837500L, 1384543912500L, 1384549237500L, 1384981237500L, 1385047762500L, 1385058562500L, 1385067637500L,
        1385148712500L, 1385154037500L, 1385413237500L, 1385499637500L, 1385565262500L, 1385586037500L, 1385747362500L, 1385753512500L, 1385758837500L, 1386018037500L, 1386190837500L, 1386277237500L,
        1386358312500L, 1386363637500L, 1386709237500L, 1386795637500L, 1386882037500L, 1386929662500L, 1386963112500L, 1386968437500L, 1387400437500L, 1387486837500L, 1387547062500L, 1387567912500L,
        1387573237500L, 1387918837500L, 1388158162500L, 1388172712500L, 1388178037500L, 1388437237500L, 1388523637500L, 1388755687500L, 1388777512500L, 1388782837500L, 1389128437500L, 1389159862500L,
        1389361387500L, 1389646837500L, 1389708562500L, 1389733237500L, 1389819637500L, 1389906037500L, 1389987112500L, 1389992437500L, 1390403662500L, 1390424437500L, 1390510837500L, 1390591912500L,
        1390597237500L, 1390856437500L, 1390942837500L, 1391029237500L, 1391115637500L, 1391190262500L, 1391196712500L, 1391202037500L, 1391801512500L, 1392066037500L, 1392152437500L, 1392184162500L,
        1392325237500L, 1392406312500L, 1392411637500L, 1392670837500L, 1392757237500L, 1392821362500L, 1392821662500L, 1392823162500L, 1392843637500L, 1393011112500L, 1393016437500L, 1393275637500L,
        1393362037500L, 1393438762500L, 1393438987500L, 1393448437500L, 1393610362500L, 1393615912500L, 1393621237500L, 1393966837500L, 1394053237500L, 1394055862500L, 1394139637500L, 1394199262500L,
        1394220712500L, 1394226037500L, 1394485237500L, 1394571637500L, 1394658037500L, 1394744437500L, 1394825512500L, 1394830837500L, 1395164062500L, 1395176437500L, 1395262837500L, 1395349237500L,
        1395430312500L, 1395435637500L, 1395781237500L, 1395867637500L, 1395945862500L, 1395951862500L, 1395954037500L, 1396035112500L, 1396040437500L, 1396386037500L, 1396558837500L, 1396614862500L,
        1396639912500L, 1396645237500L, 1396904437500L, 1396990837500L, 1397077237500L, 1397163637500L, 1397214562500L, 1397244712500L, 1397250037500L, 1397595637500L, 1397663662500L, 1397682037500L,
        1397849512500L, 1397854837500L, 1398114037500L, 1398286837500L, 1398454312500L, 1398459637500L, 1398805237500L, 1398978037500L, 1399059112500L, 1399064437500L, 1399410037500L, 1399496437500L,
        1399567987500L, 1399569862500L, 1399582837500L, 1399640062500L, 1399663912500L, 1399669237500L, 1400268712500L, 1400533237500L, 1400619637500L, 1400706037500L, 1400873512500L, 1400878837500L,
        1401310837500L, 1401397237500L, 1401478312500L, 1401483637500L, 1402002037500L, 1402083112500L, 1402088437500L, 1402347637500L, 1402434037500L, 1402606837500L, 1402687912500L, 1402693237500L,
        1403125237500L, 1403211637500L, 1403292712500L, 1403298037500L, 1403730037500L, 1403816437500L, 1403879962500L, 1403897512500L, 1403902837500L, 1404248437500L, 1404334837500L, 1404421237500L,
        1404502312500L, 1404507637500L, 1404766837500L, 1404853237500L, 1404939637500L, 1405026037500L, 1405091362500L, 1405091587500L, 1405112437500L, 1405458037500L, 1405519462500L, 1405544437500L,
        1405630837500L, 1405711912500L, 1405717237500L, 1406149237500L, 1406301862500L, 1406322037500L, 1406581237500L, 1406667637500L, 1406708962500L, 1406754037500L, 1406921512500L, 1406926837500L,
        1407186037500L, 1407252862500L, 1407272437500L, 1407358837500L, 1407526312500L, 1407531637500L, 1407790837500L, 1407877237500L, 1408050037500L, 1408131112500L, 1408136437500L, 1408568437500L,
        1408654837500L, 1408735912500L, 1408741237500L, 1409086837500L, 1409119762500L, 1409120962500L, 1409173237500L, 1409340712500L, 1409346037500L, 1409691637500L, 1409778037500L, 1409833762500L,
        1409864437500L, 1409945512500L, 1409950837500L, 1410296437500L, 1410382837500L, 1410431962500L, 1410432862500L, 1410461062500L, 1410461287500L, 1410469237500L, 1410550312500L, 1410555637500L,
        1410814837500L, 1410901237500L, 1411074037500L, 1411130062500L, 1411130962500L, 1411155112500L, 1411160437500L, 1411506037500L, 1411592437500L, 1411648387500L, 1411709362500L, 1411759912500L,
        1411765237500L, 1412197237500L, 1412215162500L, 1412283637500L, 1412340262500L, 1412364712500L, 1412370037500L, 1412629237500L, 1412777662500L, 1412802037500L, 1412887762500L, 1412888437500L,
        1412969512500L, 1413234037500L, 1413309262500L, 1413320437500L, 1413406837500L, 1413452662500L, 1413452887500L, 1413493237500L, 1413546862500L, 1413574312500L, 1413579637500L, 1413838837500L,
        1413896662500L, 1413896962500L, 1413925237500L, 1413986587500L, 1414098037500L, 1414179112500L, 1414443637500L, 1414506262500L, 1414530037500L, 1414616437500L, 1414702837500L, 1414758862500L,
        1414759462500L, 1414783912500L, 1414789237500L, 1415134837500L, 1415221237500L, 1415307637500L, 1415367262500L, 1415367562500L, 1415388712500L, 1415394037500L, 1415739637500L, 1415800462500L,
        1415826037500L, 1415912437500L, 1415914162500L, 1415914462500L, 1415982562500L, 1415993512500L, 1415998837500L, 1416344437500L, 1416430837500L, 1416467587500L, 1416468862500L, 1416517237500L,
        1416566362500L, 1416576862500L, 1416598312500L, 1416603637500L, 1416949237500L, 1417035637500L, 1417101562500L, 1417101862500L, 1417122037500L, 1417188562500L, 1417203112500L, 1417208437500L,
        1417467637500L, 1417530862500L, 1417531462500L, 1417554037500L, 1417640437500L, 1417786462500L, 1417807912500L, 1417813237500L, 1418072437500L, 1418137687500L, 1418158837500L, 1418245237500L,
        1418306062500L, 1418331637500L, 1418412712500L, 1418418037500L, 1418763637500L, 1418843062500L, 1418936437500L, 1419017512500L, 1419022837500L, 1419282037500L, 1419622312500L, 1419973237500L,
        1420202062500L, 1420227112500L, 1420232437500L, 1420568362500L, 1420578037500L, 1420664437500L, 1420750837500L, 1420831912500L, 1420837237500L, 1421182837500L, 1421269237500L, 1421323762500L,
        1421355637500L, 1421412262500L, 1421436712500L, 1421442037500L, 1421757262500L, 1421787637500L, 1421852662500L, 1421874037500L, 1422041512500L, 1422046837500L, 1422373162500L, 1422392437500L,
        1422471862500L, 1422478837500L, 1422549262500L, 1422565237500L, 1422626062500L, 1422910837500L, 1422985762500L, 1422997237500L, 1423046962500L, 1423083637500L, 1423143262500L, 1423170037500L,
        1423229662500L, 1423515637500L, 1423580362500L, 1423602037500L, 1423732762500L, 1423751662500L, 1423774837500L, 1423855912500L, 1424120437500L, 1424165962500L, 1424206837500L, 1424259862500L,
        1424260162500L, 1424293237500L, 1424339662500L, 1424379637500L, 1424426962500L, 1424811637500L, 1424898037500L, 1424959462500L, 1424984437500L, 1425042562500L, 1425065512500L, 1425070837500L,
        1425330037500L, 1425389662500L, 1425416437500L, 1425564787500L, 1425570562500L, 1425589237500L, 1425649462500L, 1425670312500L, 1425675637500L, 1426107637500L, 1426156162500L, 1426163662500L,
        1426194037500L, 1426248562500L, 1426275112500L, 1426280437500L, 1426539637500L };

    final ArrayList<Double> values = new ArrayList<Double>(vals.length);
    for (double v : vals) {
      values.add(v);
    }

    final ArrayList<Date> dates = new ArrayList<Date>(time.length);
    for (long t : time) {
      dates.add(new Date(t));
    }

    chart.addSeries("Values", dates, values);
    new SwingWrapper(chart).displayChart();
  }

}
