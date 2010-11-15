<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895903d5(jetbrains.mps.baseLanguage.dates.structure)">
  <persistence version="7" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="cccc689c-f365-4862-a8b6-34ecddf8ee26(jetbrains.mps.baseLanguage.dates)" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yvkw" modelUID="r:00000000-0000-4000-0000-011c895903dd(jetbrains.mps.baseLanguage.datesInternal.structure)" version="3" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="yvl1" modelUID="r:00000000-0000-4000-0000-011c895903d6(jetbrains.mps.baseLanguage.dates.accessories)" version="-1" />
  <import index="yvl0" modelUID="r:00000000-0000-4000-0000-011c895903d5(jetbrains.mps.baseLanguage.dates.structure)" version="1" implicit="yes" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <roots>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169481390637">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateFormatsTable" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169487448949">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateFormat" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169495318439">
      <property name="name" nameId="yvnu.1169194664001:0" value="LiteralFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169495337236">
      <property name="name" nameId="yvnu.1169194664001:0" value="FormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169557513226">
      <property name="name" nameId="yvnu.1169194664001:0" value="FormatExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169562965517">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConditionalFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169563273551">
      <property name="name" nameId="yvnu.1169194664001:0" value="ReferenceFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169563444535">
      <property name="name" nameId="yvnu.1169194664001:0" value="TokenConditionalPair" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169630122569">
      <property name="name" nameId="yvnu.1169194664001:0" value="NowExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1169631506005">
      <property name="name" nameId="yvnu.1169194664001:0" value="TokenCondition" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1171902375079">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeType" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1171963068132">
      <property name="name" nameId="yvnu.1169194664001:0" value="UnaryDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172074800504">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeCompareOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1172075151844">
      <property name="name" nameId="yvnu.1169194664001:0" value="CompareType" />
      <property name="memberIdentifierPolicy" nameId="yvnr.1197591154882:0" value="custom" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172324086632">
      <property name="name" nameId="yvnu.1169194664001:0" value="RoundDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.round" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1171963068132:1" resolveInfo="UnaryDateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172325083904">
      <property name="name" nameId="yvnu.1169194664001:0" value="FloorDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.round" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1172324086632:1" resolveInfo="RoundDateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172325617850">
      <property name="name" nameId="yvnu.1169194664001:0" value="CeilingDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.round" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1172324086632:1" resolveInfo="RoundDateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172331114860">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeWithPropertyOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.property" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1171963068132:1" resolveInfo="UnaryDateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172487727591">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodType" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1164118113764:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172489559047">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodConstant" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172679701720">
      <property name="name" nameId="yvnu.1169194664001:0" value="FixedLocaleFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1173959836330">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimePropertyFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1173975646059">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateFormatVisibility" />
      <property name="memberIdentifierPolicy" nameId="yvnr.1197591154882:0" value="custom" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1173975646060:1" resolveInfo="PUBLIC" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174039789930">
      <property name="name" nameId="yvnu.1169194664001:0" value="InlineFormatExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1171963068132:1" resolveInfo="UnaryDateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174317913525">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeOffsetFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174320869813">
      <property name="name" nameId="yvnu.1169194664001:0" value="DurationTypeReference" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.date" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174386108135">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeMinusOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174387394067">
      <property name="name" nameId="yvnu.1169194664001:0" value="AbsDateTimeMinusOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174386108135:1" resolveInfo="DateTimeMinusOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1194003500823">
      <property name="name" nameId="yvnu.1169194664001:0" value="ScheduleLiteral" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant.schedule" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConstrainedDataTypeDeclaration" typeId="yvnr.1082978499127:0" id="1194004752522">
      <property name="name" nameId="yvnu.1169194664001:0" value="ZeroSixtyInteger" />
      <property name="constraint" nameId="yvnr.1083066089218:0" value="[012345]\\d" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant.schedule" />
    </node>
    <node type="yvnr.ConstrainedDataTypeDeclaration" typeId="yvnr.1082978499127:0" id="1194004947075">
      <property name="name" nameId="yvnu.1169194664001:0" value="ZeroTwentyFourInteger" />
      <property name="constraint" nameId="yvnr.1083066089218:0" value="([01]\\d)|(2[0-3])" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant.schedule" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1194005227362">
      <property name="name" nameId="yvnu.1169194664001:0" value="DayOfWeek" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant.schedule" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node type="yvnr.ConstrainedDataTypeDeclaration" typeId="yvnr.1082978499127:0" id="1194005562740">
      <property name="name" nameId="yvnu.1169194664001:0" value="OneThirtyOneInteger" />
      <property name="constraint" nameId="yvnr.1083066089218:0" value="([123456789])|([12]\\d)|(3[01])" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant.schedule" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1207143297026">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimePlusPeriodOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1207222873197">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeMinusPeriodOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209035204722">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertToDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.convert" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209035760903">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209036122468">
      <property name="name" nameId="yvnu.1169194664001:0" value="NotNullOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.compare" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1209035760903:1" resolveInfo="DateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209036143519">
      <property name="name" nameId="yvnu.1169194664001:0" value="NullOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.compare" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1209035760903:1" resolveInfo="DateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209036309347">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertToJavaCalendarOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1209035760903:1" resolveInfo="DateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209036325551">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertToJavaDateOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.convert" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1209035760903:1" resolveInfo="DateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209036336317">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertToJodaDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1209035760903:1" resolveInfo="DateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1209039739631">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimePropetyReferenceOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.property" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1209035760903:1" resolveInfo="DateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238088288461">
      <property name="name" nameId="yvnu.1169194664001:0" value="NeverExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238248029297">
      <property name="name" nameId="yvnu.1169194664001:0" value="MathDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.math" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238248680491">
      <property name="name" nameId="yvnu.1169194664001:0" value="MinDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.math" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1238248029297:1" resolveInfo="BinaryDateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238248707649">
      <property name="name" nameId="yvnu.1169194664001:0" value="MaxDateTimeOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.math" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1238248029297:1" resolveInfo="MathDateTimeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238513516532">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeZoneType" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238513709008">
      <property name="name" nameId="yvnu.1169194664001:0" value="TimeZoneConstant" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="timezone" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238514419896">
      <property name="name" nameId="yvnu.1169194664001:0" value="DefaultTimeZoneConstant" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="timezone" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1238513709008:1" resolveInfo="TimeZoneConstant" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238514476665">
      <property name="name" nameId="yvnu.1169194664001:0" value="UTCTimeZoneConstant" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="timezone" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1238513709008:1" resolveInfo="TimeZoneConstant" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1238855581199">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeZoneCreator" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1239015860192">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConstantTimeZoneRef" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="timezone" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1239019022206">
      <property name="name" nameId="yvnu.1169194664001:0" value="TimeZoneFromString" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="timezone" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1239036439524">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodInPropertyOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1239193939163">
      <property name="name" nameId="yvnu.1169194664001:0" value="WithPropertyCompareExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.compare" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1892577441204578414">
      <property name="name" nameId="yvnu.1169194664001:0" value="ParseExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="deprecated" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="4555537781927648369">
      <property name="name" nameId="yvnu.1169194664001:0" value="TimeZoneIDExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="timezone" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5473692278135631085">
      <property name="name" nameId="yvnu.1169194664001:0" value="TimeZoneOffsetExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="timezone" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1195930031035447613">
      <property name="name" nameId="yvnu.1169194664001:0" value="DateTimeWithTZType" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="2639623922402691276">
      <property name="name" nameId="yvnu.1169194664001:0" value="InTimezoneExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.convert" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="4389880778953634893">
      <property name="name" nameId="yvnu.1169194664001:0" value="ParseDateTimeExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5034322243092296606">
      <property name="name" nameId="yvnu.1169194664001:0" value="FormatDateTimeExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5034322243093083314">
      <property name="name" nameId="yvnu.1169194664001:0" value="InlineFormatDateTimeExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3931616304474644667">
      <property name="name" nameId="yvnu.1169194664001:0" value="DurationType" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5372916090361181333">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertToDurationOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.convert" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="276836602888578296">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodInPropertyExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.property" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="779372288056193783">
      <property name="name" nameId="yvnu.1169194664001:0" value="TimeConstant" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="34521615669572115">
      <property name="name" nameId="yvnu.1169194664001:0" value="FormatPeriodExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="48671598477573965">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodFormat" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="48671598477578848">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.period" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="48671598477581889">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodLiteralFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.period" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="48671598477578848:1" resolveInfo="PeriodFormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="48671598477850406">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodFormatsTable" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7249953535157196261">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodPropertyFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.period" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="48671598477578848:1" resolveInfo="PeriodFormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7249953535157212421">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodReferenceFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.period" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="48671598477578848:1" resolveInfo="PeriodFormatToken" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5581663871702358898">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodSeparatorFormatToken" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.period" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="48671598477578848:1" resolveInfo="PeriodFormatToken" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="5581663871702358901">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodSeparatorKind" />
      <property name="memberIdentifierPolicy" nameId="yvnr.1197591154882:0" value="custom" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.period" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="5581663871702358902:1" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1778677549314158595">
      <property name="name" nameId="yvnu.1169194664001:0" value="PeriodZeroHandlingKind" />
      <property name="memberIdentifierPolicy" nameId="yvnr.1197591154882:0" value="custom" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="format.period" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1778677549314158598:1" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5293902215864051658">
      <property name="name" nameId="yvnu.1169194664001:0" value="TimeZoneIdOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.property" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5293902215864689835">
      <property name="name" nameId="yvnu.1169194664001:0" value="TimeZoneNameOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.property" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5293902215865424196">
      <property name="name" nameId="yvnu.1169194664001:0" value="AllTimeZonesConstant" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="constant" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
  </roots>
  <root id="1169481390637">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169488417691">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateFormat" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1169487448949:1" resolveInfo="DateFormat" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1219697389577">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="1169487448949">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172682197983">
      <property name="value" nameId="yvnr.1105725733873:0" value="date format" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169487470543">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="token" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1173882390903">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvkw.1173884671039:3" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1173975856624">
      <property name="name" nameId="yvnu.1169194664001:0" value="dateFormatVisibility" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1173975646059:1" resolveInfo="DateFormatVisibility" />
    </node>
  </root>
  <root id="1169495318439">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1169495350409">
      <property name="name" nameId="yvnu.1169194664001:0" value="value" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169495493273">
      <property name="value" nameId="yvnr.1105725733873:0" value="'" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169546639931">
      <property name="value" nameId="yvnr.1105725733873:0" value="custom text" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1169495337236">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1169543700004">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1169557513226">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169557612323">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateExpression" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239015930559">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="zone" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169557643590">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateFormat" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173884671039:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1238661857677">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" resolveInfo="Locale" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169557687716">
      <property name="value" nameId="yvnr.1105725733873:0" value="#" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172063525570">
      <property name="value" nameId="yvnr.1105725733873:0" value="Format instant using predefined formatter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178203664031">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="4555537781928182636">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1201183863028:3" resolveInfo="TypeDerivable" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="2890840340813345706" />
  </root>
  <root id="1169562965517">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169563619049">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="conditionPair" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1169563444535:1" resolveInfo="TokenConditionalPair" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169563773421">
      <property name="value" nameId="yvnr.1105725733873:0" value="switch" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169563792283">
      <property name="value" nameId="yvnr.1105725733873:0" value="conditional token" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1075917115049836851">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="1169563273551">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169563300146">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateFormat" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173884671039:3" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169563323944">
      <property name="value" nameId="yvnr.1105725733873:0" value="&lt;&lt;{dateFormat}&gt;&gt;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169563356852">
      <property name="value" nameId="yvnr.1105725733873:0" value="insert date format" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1169563444535">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169563469176">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="condition" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1169631506005:1" resolveInfo="TokenCondition" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1169563482193">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="format" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173884671039:3" />
    </node>
  </root>
  <root id="1169630122569">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1169630187167">
      <property name="value" nameId="yvnr.1105725733873:0" value="now" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1169631506005">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1172162329997">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1172162332013" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1172162116793">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137546998352:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1172162157215">
        <property name="name" nameId="yvnu.1169194664001:0" value="TokenCondition_datetimeToFormat" />
        <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172162288196">
          <property name="value" nameId="yvnr.1105725733873:0" value="datetimeToFormat" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
        </node>
        <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1172162304446">
          <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" />
          <node role="target" roleId="yvnr.1105736901241:0" type="yvl0.DateTimeType" typeId="1171902375079:1" id="1172162315705" />
        </node>
      </node>
    </node>
  </root>
  <root id="1171902375079">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1171902397815">
      <property name="value" nameId="yvnr.1105725733873:0" value="instant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1171963068132">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1171964003156">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetime" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1171963236441">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1172074800504">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172075931971">
      <property name="value" nameId="yvnr.1105725733873:0" value="compare dates by &lt;{datetimeProperty}&gt;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172077799868">
      <property name="value" nameId="yvnr.1105725733873:0" value="Compare datetimes" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1172075381034">
      <property name="name" nameId="yvnu.1169194664001:0" value="compareType" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1172075151844:1" resolveInfo="CompareType" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172074898284">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="op1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172074912819">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="op2" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172074844144">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetimeProperty" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" />
    </node>
    <node role="conceptLinkDeclaration" roleId="yvnr.1137532086877:0" type="yvnr.ReferenceConceptLinkDeclaration" typeId="yvnr.1105741578420:0" id="1178372678354">
      <property name="name" nameId="yvnu.1169194664001:0" value="defaultDatetimeProperty" />
      <link role="targetType" roleId="yvnr.1105736621938:0" targetNodeId="yvkw.1172074318583:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1178372706486">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1178372678354:1" resolveInfo="defaultDatetimeProperty" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvl1.1172074929011" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239040117109" />
  </root>
  <root id="1172075151844">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1172075151845">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="==" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="datetime equals" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="EQUALS" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1172075185460">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="!=" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="datetime not equals" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="NOT_EQUALS" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1172075218062">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="&gt;" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="datetime greater" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="GREATER" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1172075248796">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="&gt;=" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="datetime greater or equals" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="GREATER_OR_EQUALS" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1172075265977">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="&lt;" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="datetime less" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="LESS" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1172075272162">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="&lt;=" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="datetime less or equals" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="LESS_OR_EQUALS" />
    </node>
  </root>
  <root id="1172324086632">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172324242744">
      <property name="value" nameId="yvnr.1105725733873:0" value="round to" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172324257215">
      <property name="value" nameId="yvnr.1105725733873:0" value="Round datetime to the nearest" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178205401199">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172324147302">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="precision" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" />
    </node>
  </root>
  <root id="1172325083904">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172325083905">
      <property name="value" nameId="yvnr.1105725733873:0" value="round down to" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172325083906">
      <property name="value" nameId="yvnr.1105725733873:0" value="Round datetime to the nearest that is less than" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178205414391">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1172325617850">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172325617851">
      <property name="value" nameId="yvnr.1105725733873:0" value="round up to" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172325617852">
      <property name="value" nameId="yvnr.1105725733873:0" value="Round datetime to the nearest that is greater than" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178205407061">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1172331114860">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172331207547">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateTimeProperty" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172331281757">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="expression" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172331196659">
      <property name="value" nameId="yvnr.1105725733873:0" value="with" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172331249737">
      <property name="value" nameId="yvnr.1105725733873:0" value="same datetime but with property set to" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178204975083">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1172487727591">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172487784960">
      <property name="value" nameId="yvnr.1105725733873:0" value="period" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1172489559047">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172491543832">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="count" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172489570282">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateTimeProperty" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" />
    </node>
  </root>
  <root id="1172679701720">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172679863969">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1172683726790">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateFormat" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173884671039:3" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1172683758207">
      <property name="value" nameId="yvnr.1105725733873:0" value="with locale" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1173959836330">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1173960023920">
      <property name="value" nameId="yvnr.1105725733873:0" value="{&lt;{dateTimePropertyFormatConfiguration}&gt;}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1173968765736">
      <property name="value" nameId="yvnr.1105725733873:0" value="datetime property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1173966637440">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateTimePropertyFormatConfiguration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1174042847309:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1173959975857">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateTimePropertyFormatType" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173953623139:3" />
    </node>
  </root>
  <root id="1173975646059">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1173975646060">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="public" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="public" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="PUBLIC" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1173975646061">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="private" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="private" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="PRIVATE" />
    </node>
  </root>
  <root id="1174039789930">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174046000278">
      <property name="name" nameId="yvnu.1169194664001:0" value="withLocale" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174039835698">
      <property name="value" nameId="yvnr.1105725733873:0" value="&lt;datetime&gt;#{&lt;format&gt;}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1178211569462">
      <property name="value" nameId="yvnr.1105725733873:0" value="Format instant using inline formatter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178205325518">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174039888135">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="formatToken" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239016087043">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="zone" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174045884375">
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="2890840340813345707" />
  </root>
  <root id="1174317913525">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174321263884">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="durationTypeReference" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174320869813:1" resolveInfo="DurationTypeReference" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="779372288057192089">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="referenceTime" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174320614661">
      <property name="value" nameId="yvnr.1105725733873:0" value="{time} ago" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1174320869813">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174320881454">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="durationType" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1174320693350:3" />
    </node>
  </root>
  <root id="1174386108135">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174386153808">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="leftValue" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174386164996">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="rightValue" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174386223029">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetimeProperty" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174386256530">
      <property name="value" nameId="yvnr.1105725733873:0" value="-" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174386265204">
      <property name="value" nameId="yvnr.1105725733873:0" value="Period from right value to left value" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178202643382">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239036310502" />
  </root>
  <root id="1174387394067">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174387424365">
      <property name="value" nameId="yvnr.1105725733873:0" value="-" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174387474883">
      <property name="value" nameId="yvnr.1105725733873:0" value="Positive period from one value to another" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1178202649447">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239036315987" />
  </root>
  <root id="1194003500823">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1194007702067">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="schedulePeriod" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1194006427224:3" resolveInfo="SchedulePeriod" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1194007893424">
      <property name="role" nameId="yvnr.1071599776563:0" value="month" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1194005944850:3" resolveInfo="Month" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1194007836084">
      <property name="name" nameId="yvnu.1169194664001:0" value="second" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194004752522:1" resolveInfo="ZeroSixtyInteger" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1194007839276">
      <property name="name" nameId="yvnu.1169194664001:0" value="minute" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194004752522:1" resolveInfo="ZeroSixtyInteger" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1194007847131">
      <property name="name" nameId="yvnu.1169194664001:0" value="hour" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194004947075:1" resolveInfo="ZeroTwentyFourInteger" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1194007857175">
      <property name="name" nameId="yvnu.1169194664001:0" value="dayOfWeek" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194005227362:1" resolveInfo="DayOfWeek" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1194007870973">
      <property name="name" nameId="yvnu.1169194664001:0" value="dayOfMonth" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194005562740:1" resolveInfo="OneThirtyOneInteger" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1194009666713">
      <property name="value" nameId="yvnr.1105725733873:0" value="&lt;{schedulePeriod}&gt;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1194004752522" />
  <root id="1194004947075" />
  <root id="1194005227362">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1194005227363">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="SUN" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="Sunday" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1194005250369">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="Monday" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="MON" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1194005256642">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="Tuesday" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="TUE" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1194005260323">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="Thursday" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="THU" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1194005264365">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="Wednesday" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="WED" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1194005273661">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="Friday" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="FRI" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1194005281470">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="Saturday" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="SAT" />
    </node>
  </root>
  <root id="1194005562740" />
  <root id="1207143297026">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1207143609180">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="leftValue" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1207143609181">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="rightValue" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1207145430771">
      <property name="value" nameId="yvnr.1105725733873:0" value="+" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1207145436025">
      <property name="value" nameId="yvnr.1105725733873:0" value="datetime + period" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239027476054" />
  </root>
  <root id="1207222873197">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1207222906993">
      <property name="value" nameId="yvnr.1105725733873:0" value="-" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1207222910760">
      <property name="value" nameId="yvnr.1105725733873:0" value="datetime - period" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1207222904240">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="leftValue" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1207222904241">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="rightValue" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239027481476" />
  </root>
  <root id="1209035204722">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209035204724">
      <property name="value" nameId="yvnr.1105725733873:0" value="instant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209035204725">
      <property name="value" nameId="yvnr.1105725733873:0" value="Convert to instant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1209035280779">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
  </root>
  <root id="1209035760903">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1209035773277">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1209035783608">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209035803187">
      <property name="value" nameId="yvnr.1105725733873:0" value="&lt;datetime operation&gt;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1209036122468">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036122469">
      <property name="value" nameId="yvnr.1105725733873:0" value="isNotNull" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036122470">
      <property name="value" nameId="yvnr.1105725733873:0" value="Check if datetime is not null" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
  </root>
  <root id="1209036143519">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036143520">
      <property name="value" nameId="yvnr.1105725733873:0" value="isNull" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036143521">
      <property name="value" nameId="yvnr.1105725733873:0" value="Check if datetime is null" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
  </root>
  <root id="1209036309347">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036309350">
      <property name="value" nameId="yvnr.1105725733873:0" value="javaCalendar" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036309351">
      <property name="value" nameId="yvnr.1105725733873:0" value="Convert to java.util.Calendar" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="3931616304474476229" />
  </root>
  <root id="1209036325551">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036325552">
      <property name="value" nameId="yvnr.1105725733873:0" value="javaDate" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036325553">
      <property name="value" nameId="yvnr.1105725733873:0" value="Convert to java.util.Date" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
  </root>
  <root id="1209036336317">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036336321">
      <property name="value" nameId="yvnr.1105725733873:0" value="jodaDateTime" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209036336322">
      <property name="value" nameId="yvnr.1105725733873:0" value="Convert to org.joda.time.DateTime" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="3931616304474476228" />
  </root>
  <root id="1209039739631">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209039739632">
      <property name="value" nameId="yvnr.1105725733873:0" value="&lt;{dateTimeProperty}&gt;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1209039739633">
      <property name="value" nameId="yvnr.1105725733873:0" value="Get integer value of datetime property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1209039739637">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateTimeProperty" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" resolveInfo="DateTimeProperty" />
    </node>
  </root>
  <root id="1238088288461">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1238088313853">
      <property name="value" nameId="yvnr.1105725733873:0" value="never" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1238248029297">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1238248060720">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="leftExpression" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1238248060893">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="rightExpression" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1238248083785">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
  </root>
  <root id="1238248680491">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1238248772138">
      <property name="value" nameId="yvnr.1105725733873:0" value="min" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1238248707649">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1238248725745">
      <property name="value" nameId="yvnr.1105725733873:0" value="max" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1238513516532">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1238513542030">
      <property name="value" nameId="yvnr.1105725733873:0" value="timezone" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1238513709008">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1238513729994">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
  </root>
  <root id="1238514419896">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1238514466148">
      <property name="value" nameId="yvnr.1105725733873:0" value="default timezone" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1238514476665">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1238514488478">
      <property name="value" nameId="yvnr.1105725733873:0" value="UTC timezone" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1238855581199">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1238855978597">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="string" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1238855677875">
      <property name="value" nameId="yvnr.1105725733873:0" value="timezone" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1195930031035471008" />
  </root>
  <root id="1239015860192">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239015906660">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="zone" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1238668259228:3" resolveInfo="DateTimeZone" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1239015956962">
      <property name="value" nameId="yvnr.1105725733873:0" value="constant timezone" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1239019022206">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239019204488">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="string" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1239019299052">
      <property name="value" nameId="yvnr.1105725733873:0" value="timezone(id)" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5293902215863825362">
      <property name="value" nameId="yvnr.1105725733873:0" value="get timezone by id" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1239036439524">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239209522682">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetime" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239036706289">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetimeProperty" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" resolveInfo="DateTimeProperty" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1239036720055">
      <property name="value" nameId="yvnr.1105725733873:0" value="in" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1239036724026">
      <property name="value" nameId="yvnr.1105725733873:0" value="period in days/months/years" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="3627207017678653858">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1239037593439">
      <property name="name" nameId="yvnu.1169194664001:0" value="absolute" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="276836602888578295" />
  </root>
  <root id="1239193939163">
    <node role="conceptLinkDeclaration" roleId="yvnr.1137532086877:0" type="yvnr.ReferenceConceptLinkDeclaration" typeId="yvnr.1105741578420:0" id="1239206707675">
      <property name="name" nameId="yvnu.1169194664001:0" value="defaultDatetimeProperty" />
      <link role="targetType" roleId="yvnr.1105736621938:0" targetNodeId="yvkw.1172074318583:3" resolveInfo="DateTimeProperty" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239198287872">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="operation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1081773326031:3" resolveInfo="BinaryOperation" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1239193967166">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetimeProperty" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" resolveInfo="DateTimeProperty" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1239193969605">
      <property name="value" nameId="yvnr.1105725733873:0" value="by" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1239193977045">
      <property name="value" nameId="yvnr.1105725733873:0" value="by property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1892577441204578414">
    <node role="conceptPropertyDeclaration" roleId="yvnr.1137467167200:0" type="yvnr.StringConceptPropertyDeclaration" typeId="yvnr.1105725281956:0" id="7678715681280028185">
      <property name="name" nameId="yvnu.1169194664001:0" value="defaultKeyword" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1892577441204578966">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateFormat" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173884671039:3" resolveInfo="IDateFormat" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="2583319411283206774">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" resolveInfo="Locale" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1892577441204578449">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="source" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="2583319411283206775">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="zone" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="7678715681280019206">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="default" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1892577441204578446">
      <property name="value" nameId="yvnr.1105725733873:0" value="parse instant as" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1892577441204578448">
      <property name="value" nameId="yvnr.1105725733873:0" value="parse string as an instant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="7678715681280028188">
      <property name="value" nameId="yvnr.1105725733873:0" value="into" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="7678715681280028185:1" resolveInfo="into" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1892577441204584700">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="3394771273339504217" />
  </root>
  <root id="4555537781927648369">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="4555537781927678418">
      <property name="name" nameId="yvnu.1169194664001:0" value="timezone_id" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4555537781927653002">
      <property name="value" nameId="yvnr.1105725733873:0" value="timezone_ID" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4555537781927653004">
      <property name="value" nameId="yvnr.1105725733873:0" value="timezone with ID" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="4555537781927653000">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="5473692278135631085">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5473692278135819455">
      <property name="name" nameId="yvnu.1169194664001:0" value="offsetmillis" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" resolveInfo="integer" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5473692278135635930">
      <property name="value" nameId="yvnr.1105725733873:0" value="timezone_offset" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="5473692278135635932">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="1195930031035447613">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1195930031035447614">
      <property name="value" nameId="yvnr.1105725733873:0" value="datetime" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="2639623922402691276">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6626410111396233972">
      <property name="value" nameId="yvnr.1105725733873:0" value="in" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6626410111396233974">
      <property name="value" nameId="yvnr.1105725733873:0" value="convert to DateTime with Timezone" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="2639623922402691278">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetime" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="2639623922402691641">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="timezone" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="6626410111395870949">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1201183863028:3" resolveInfo="TypeDerivable" />
    </node>
  </root>
  <root id="4389880778953634893">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4389880778953634897">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateFormat" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173884671039:3" resolveInfo="IDateFormat" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4389880778953634898">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" resolveInfo="Locale" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4389880778953634894">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="source" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4389880778953634895">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="zone" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4389880778953634896">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="default" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4251945201431291611">
      <property name="value" nameId="yvnr.1105725733873:0" value="parse as" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4251945201431291613">
      <property name="value" nameId="yvnr.1105725733873:0" value="parse string as datetime" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="7499037524191428324">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1201183863028:3" resolveInfo="TypeDerivable" />
    </node>
  </root>
  <root id="5034322243092296606">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5034322243092298627">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="dateFormat" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1173884671039:3" resolveInfo="IDateFormat" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5034322243092298628">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" resolveInfo="Locale" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5034322243092298623">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetime" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5034322243092298624">
      <property name="value" nameId="yvnr.1105725733873:0" value="#" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5034322243092298626">
      <property name="value" nameId="yvnr.1105725733873:0" value="Format datetime using predefined formatter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5034322243092301678">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1201183863028:3" resolveInfo="TypeDerivable" />
    </node>
  </root>
  <root id="5034322243093083314">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5034322243093093771">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" resolveInfo="Locale" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5034322243093093769">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetime" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5034322243093093770">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="formatToken" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1169495337236:1" resolveInfo="FormatToken" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5034322243093092807">
      <property name="value" nameId="yvnr.1105725733873:0" value="#{&lt;format&gt;}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5034322243093092809">
      <property name="value" nameId="yvnr.1105725733873:0" value="Format datetime using inline formatter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="3931616304474644667">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3931616304474648884">
      <property name="value" nameId="yvnr.1105725733873:0" value="duration" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="5372916090361181333">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5372916090361181335">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5372916090361181336">
      <property name="value" nameId="yvnr.1105725733873:0" value="toDuration" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5372916090361181338">
      <property name="value" nameId="yvnr.1105725733873:0" value="convert to Duration" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="276836602888578296">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="276836602888578302">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetimeProperty" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" resolveInfo="DateTimeProperty" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="276836602888578297">
      <property name="value" nameId="yvnr.1105725733873:0" value="in" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="276836602888578299">
      <property name="value" nameId="yvnr.1105725733873:0" value="number of full hours/days/months in period" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="276836602888578300">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="datetime" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
  </root>
  <root id="779372288056193783">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="779372288056193790">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="timezone" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="779372288056193789">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="month" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1194005944850:3" resolveInfo="Month" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="779372288056193784">
      <property name="name" nameId="yvnu.1169194664001:0" value="second" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194004752522:1" resolveInfo="ZeroSixtyInteger" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="779372288056193785">
      <property name="name" nameId="yvnu.1169194664001:0" value="minute" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194004752522:1" resolveInfo="ZeroSixtyInteger" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="779372288056193786">
      <property name="name" nameId="yvnu.1169194664001:0" value="hour" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194004947075:1" resolveInfo="ZeroTwentyFourInteger" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="779372288056193787">
      <property name="name" nameId="yvnu.1169194664001:0" value="day" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1194005562740:1" resolveInfo="OneThirtyOneInteger" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="779372288056193788">
      <property name="name" nameId="yvnu.1169194664001:0" value="year" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" resolveInfo="integer" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="779372288056596479">
      <property name="value" nameId="yvnr.1105725733873:0" value="time constant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="779372288056596481">
      <property name="value" nameId="yvnr.1105725733873:0" value="DD-MM-YEAR HH24:MM:SS" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="779372288056821938">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1201183863028:3" resolveInfo="TypeDerivable" />
    </node>
  </root>
  <root id="34521615669572115">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="34521615669572119">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="format" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.34521615669325562:3" resolveInfo="IPeriodFormat" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="34521615669572120">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" resolveInfo="Locale" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="34521615669572118">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="period" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="34521615669572117">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1201183863028:3" resolveInfo="TypeDerivable" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="34521615669572121">
      <property name="value" nameId="yvnr.1105725733873:0" value="#" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="34521615669572123">
      <property name="value" nameId="yvnr.1105725733873:0" value="Format period using predefined formatter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="48671598477573965">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="48671598477578849">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="token" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="48671598477578848:1" resolveInfo="PeriodFormatToken" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="48671598477578846">
      <property name="name" nameId="yvnu.1169194664001:0" value="visibility" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1173975646059:1" resolveInfo="DateFormatVisibility" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="48671598477573977">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvkw.34521615669325562:3" resolveInfo="IPeriodFormat" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="48671598477578847">
      <property name="value" nameId="yvnr.1105725733873:0" value="period format" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="48671598477578848">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="48671598477581885">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
  </root>
  <root id="48671598477581889">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="48671598477581894">
      <property name="name" nameId="yvnu.1169194664001:0" value="value" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="48671598477581890">
      <property name="value" nameId="yvnr.1105725733873:0" value="'" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="48671598477581893">
      <property name="value" nameId="yvnr.1105725733873:0" value="custom text" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="48671598477850406">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="48671598477850408">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="periodFormat" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="48671598477573965:1" resolveInfo="PeriodFormat" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="48671598477850407">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
  </root>
  <root id="7249953535157196261">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871703912302">
      <property name="name" nameId="yvnu.1169194664001:0" value="prefix" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871703912303">
      <property name="name" nameId="yvnu.1169194664001:0" value="prefixPlural" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871703912304">
      <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871703912305">
      <property name="name" nameId="yvnu.1169194664001:0" value="suffixPlural" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871703912306">
      <property name="name" nameId="yvnu.1169194664001:0" value="minDigits" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1778677549314158601">
      <property name="name" nameId="yvnu.1169194664001:0" value="zeroHandling" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1778677549314158595:1" resolveInfo="PeriodZeroHandlingKind" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="7249953535157223265">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="property" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172074318583:3" resolveInfo="DateTimeProperty" />
    </node>
  </root>
  <root id="7249953535157212421">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="7249953535157212422">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="format" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.34521615669325562:3" resolveInfo="IPeriodFormat" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="7249953535157212425">
      <property name="value" nameId="yvnr.1105725733873:0" value="insert period format" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="5581663871702358898">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871702358907">
      <property name="name" nameId="yvnu.1169194664001:0" value="kind" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="5581663871702358901:1" resolveInfo="PeriodSeparatorKind" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871702358899">
      <property name="name" nameId="yvnu.1169194664001:0" value="text" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5581663871702358900">
      <property name="name" nameId="yvnu.1169194664001:0" value="lastText" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5581663871702543733">
      <property name="value" nameId="yvnr.1105725733873:0" value="separator" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5581663871702543735">
      <property name="value" nameId="yvnr.1105725733873:0" value="printed only with field around" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="5581663871702358901">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="5581663871702358902">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="default" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="both" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="DEFAULT" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="5581663871702358905">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ifBefore" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="left" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="IFBEFORE" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="5581663871702358906">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="right" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ifAfter" />
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="IFAFTER" />
    </node>
  </root>
  <root id="1778677549314158595">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1778677549314158596">
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="ALWAYS" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="always" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="always" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1778677549314158597">
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="IFSUPPORTED" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ifSupported" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="if supported" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1778677549314158598">
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="NEVER" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="never" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="never" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1778677549314158599">
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="RARELY_FIRST" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="rarelyFirst" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="rarely first" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1778677549314158600">
      <property name="javaIdentifier" nameId="yvnr.1192116978809:0" value="RARELY_LAST" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="rarelyLast" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="rarely last" />
    </node>
  </root>
  <root id="5293902215864051658">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5293902215864051659">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5293902215864075078">
      <property name="value" nameId="yvnr.1105725733873:0" value="id" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5293902215864075080">
      <property name="value" nameId="yvnr.1105725733873:0" value="timezone string id" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="5293902215864689835">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5293902215864942486">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="locale" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvkw.1172680728258:3" resolveInfo="Locale" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="5293902215864698564">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="instant" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5293902215864689837">
      <property name="name" nameId="yvnu.1169194664001:0" value="property" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5293902215864689836">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5293902215864689838">
      <property name="value" nameId="yvnr.1105725733873:0" value="name" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="8736588939155698759">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="5293902215865424196">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5293902215865424197">
      <property name="value" nameId="yvnr.1105725733873:0" value="allTimeZoneIDs" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5293902215865431551">
      <property name="value" nameId="yvnr.1105725733873:0" value="gets all the available IDs" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
</model>

