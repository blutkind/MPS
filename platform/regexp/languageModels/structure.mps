<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590518(jetbrains.mps.baseLanguage.regexp.structure)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="yvpe" modelUID="r:00000000-0000-4000-0000-011c89590518(jetbrains.mps.baseLanguage.regexp.structure)" version="0" implicit="yes" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <roots>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174482743037">
      <property name="name" nameId="yvnu.1169194664001:0" value="Regexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174482753837">
      <property name="name" nameId="yvnu.1169194664001:0" value="StringLiteralRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174482769792">
      <property name="name" nameId="yvnu.1169194664001:0" value="OrRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485167097:0" resolveInfo="BinaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174482804200">
      <property name="name" nameId="yvnu.1169194664001:0" value="PlusRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174482808826">
      <property name="name" nameId="yvnu.1169194664001:0" value="StarRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174483125581">
      <property name="name" nameId="yvnu.1169194664001:0" value="RegexpDeclaration" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="false" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174484562151">
      <property name="name" nameId="yvnu.1169194664001:0" value="SeqRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485167097:0" resolveInfo="BinaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174485167097">
      <property name="name" nameId="yvnu.1169194664001:0" value="BinaryRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174485235885">
      <property name="name" nameId="yvnu.1169194664001:0" value="UnaryRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174491169200">
      <property name="name" nameId="yvnu.1169194664001:0" value="ParensRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174510540317">
      <property name="name" nameId="yvnu.1169194664001:0" value="InlineRegexpExpression" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174919147781:0" resolveInfo="RegexpExpression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174512414484">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchRegexpStatement" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Statements" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068580123157:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174552240608">
      <property name="name" nameId="yvnu.1169194664001:0" value="QuestionRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174554186090">
      <property name="name" nameId="yvnu.1169194664001:0" value="SymbolClassRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174554211468">
      <property name="name" nameId="yvnu.1169194664001:0" value="PositiveSymbolClassRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174554186090:0" resolveInfo="SymbolClassRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174554238051">
      <property name="name" nameId="yvnu.1169194664001:0" value="NegativeSymbolClassRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174554186090:0" resolveInfo="SymbolClassRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174554386384">
      <property name="name" nameId="yvnu.1169194664001:0" value="PredefinedSymbolClassDeclaration" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174554406855">
      <property name="name" nameId="yvnu.1169194664001:0" value="PredefinedSymbolClasses" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="false" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174555732504">
      <property name="name" nameId="yvnu.1169194664001:0" value="PredefinedSymbolClassRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174556813606">
      <property name="name" nameId="yvnu.1169194664001:0" value="DotRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174557861378">
      <property name="name" nameId="yvnu.1169194664001:0" value="SymbolClassPart" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SymbolClassParts" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174557878319">
      <property name="name" nameId="yvnu.1169194664001:0" value="CharacterSymbolClassPart" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SymbolClassParts" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174557861378:0" resolveInfo="SymbolClassPart" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174558301835">
      <property name="name" nameId="yvnu.1169194664001:0" value="IntervalSymbolClassPart" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SymbolClassParts" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174557861378:0" resolveInfo="SymbolClassPart" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174558792178">
      <property name="name" nameId="yvnu.1169194664001:0" value="PredefinedSymbolClassSymbolClassPart" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SymbolClassParts" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174557861378:0" resolveInfo="SymbolClassPart" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174564062919">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchParensRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174565027678">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchVariableReference" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Expressions" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.InterfaceConceptDeclaration" typeId="yvnr.1169125989551:0" id="1174653354106">
      <property name="name" nameId="yvnu.1169194664001:0" value="RegexpUsingConstruction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174655989549">
      <property name="name" nameId="yvnu.1169194664001:0" value="ReplaceWithRegexpExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Expressions" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174656254036">
      <property name="name" nameId="yvnu.1169194664001:0" value="ReplaceBlock" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1152728232947:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174660461415">
      <property name="name" nameId="yvnu.1169194664001:0" value="LazyStarRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174660505718">
      <property name="name" nameId="yvnu.1169194664001:0" value="LazyPlusRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174660533095">
      <property name="name" nameId="yvnu.1169194664001:0" value="LazyQuestionRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174662351725">
      <property name="name" nameId="yvnu.1169194664001:0" value="Regexps" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174662605354">
      <property name="name" nameId="yvnu.1169194664001:0" value="RegexpDeclarationReferenceRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174904166999">
      <property name="name" nameId="yvnu.1169194664001:0" value="NTimesRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174904442594">
      <property name="name" nameId="yvnu.1169194664001:0" value="AtLeastNTimesRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174904605806">
      <property name="name" nameId="yvnu.1169194664001:0" value="FromNToMTimesRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174485235885:0" resolveInfo="UnaryRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174906321267">
      <property name="name" nameId="yvnu.1169194664001:0" value="PositiveLookAheadRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174906544517:0" resolveInfo="LookRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174906468661">
      <property name="name" nameId="yvnu.1169194664001:0" value="NegativeLookAheadRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174906544517:0" resolveInfo="LookRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174906544517">
      <property name="name" nameId="yvnu.1169194664001:0" value="LookRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174906762287">
      <property name="name" nameId="yvnu.1169194664001:0" value="PositiveLookBehindRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174906544517:0" resolveInfo="LookRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174906790902">
      <property name="name" nameId="yvnu.1169194664001:0" value="NegativeLookBehindRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174906544517:0" resolveInfo="LookRegexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174909099093">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchVariableReferenceRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174919147781">
      <property name="name" nameId="yvnu.1169194664001:0" value="RegexpExpression" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1175154849582">
      <property name="name" nameId="yvnu.1169194664001:0" value="ForEachMatchStatement" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Statements" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068580123157:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1175161264766">
      <property name="name" nameId="yvnu.1169194664001:0" value="LineStartRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1175161300324">
      <property name="name" nameId="yvnu.1169194664001:0" value="LineEndRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1175164405556">
      <property name="name" nameId="yvnu.1169194664001:0" value="SplitExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Expressions" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1175169009571">
      <property name="name" nameId="yvnu.1169194664001:0" value="FindMatchStatement" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Statements" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068580123157:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1179357154354">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchRegexpExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Expressions" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1203415418648">
      <property name="name" nameId="yvnu.1169194664001:0" value="UnicodeCharacterRegexp" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node type="yvnr.ConstrainedDataTypeDeclaration" typeId="yvnr.1082978499127:0" id="1203415512996">
      <property name="name" nameId="yvnu.1169194664001:0" value="FourHex" />
      <property name="constraint" nameId="yvnr.1083066089218:0" value="[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1220021842985">
      <property name="name" nameId="yvnu.1169194664001:0" value="IntersectionSymbolClassPart" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SymbolClassParts" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1174557861378:0" resolveInfo="SymbolClassPart" />
    </node>
    <node type="yvnr.InterfaceConceptDeclaration" typeId="yvnr.1169125989551:0" id="1220356640633">
      <property name="name" nameId="yvnu.1169194664001:0" value="SymbolClassRegexpAndPart" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Regexps" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1222256539755">
      <property name="name" nameId="yvnu.1169194664001:0" value="SplitOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Operations" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1222260469397">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchRegexpOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Operations" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1222260556146">
      <property name="name" nameId="yvnu.1169194664001:0" value="ReplaceWithRegexpOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Operations" />
    </node>
    <node type="yvnr.ConstrainedDataTypeDeclaration" typeId="yvnr.1082978499127:0" id="7473568212391781030">
      <property name="name" nameId="yvnu.1169194664001:0" value="_StringRegexp" />
      <property name="constraint" nameId="yvnr.1083066089218:0" value="[^\\+?.\\[\\]]+" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="6129327962763158517">
      <property name="name" nameId="yvnu.1169194664001:0" value="FindMatchExpression" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Expressions" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3796137614137086346">
      <property name="name" nameId="yvnu.1169194664001:0" value="ReplaceRegexpOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Operations" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3796137614137538892">
      <property name="name" nameId="yvnu.1169194664001:0" value="LiteralReplacement" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Replaces" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="3796137614137538898:0" resolveInfo="Replacement" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3796137614137538894">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchVariableReferenceReplacement" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Replaces" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="3796137614137538898:0" resolveInfo="Replacement" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3796137614137538898">
      <property name="name" nameId="yvnu.1169194664001:0" value="Replacement" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Replaces" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
  </roots>
  <root id="1174482743037">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1174482750898">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1174482753837">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174483061702">
      <property name="value" nameId="yvnr.1105725733873:0" value="'" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174482761807">
      <property name="name" nameId="yvnu.1169194664001:0" value="text" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
  </root>
  <root id="1174482769792">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174483022852">
      <property name="value" nameId="yvnr.1105725733873:0" value="|" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1174482804200">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174483026791">
      <property name="value" nameId="yvnr.1105725733873:0" value="+" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547009366">
      <property name="value" nameId="yvnr.1105725733873:0" value="one or more times" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174482808826">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174483030683">
      <property name="value" nameId="yvnr.1105725733873:0" value="*" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547104211">
      <property name="value" nameId="yvnr.1105725733873:0" value="zero or more times" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174483125581">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174662978120">
      <property name="name" nameId="yvnu.1169194664001:0" value="description" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174483133849">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1174483129770">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
  </root>
  <root id="1174484562151">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174484606306">
      <property name="value" nameId="yvnr.1105725733873:0" value="seq" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1174485167097">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174485176897">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="left" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174485181039">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="right" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1174485172364">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1174485235885">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1174485252764">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174485243418">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
  </root>
  <root id="1174491169200">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174491382873">
      <property name="value" nameId="yvnr.1105725733873:0" value="(" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174491385468">
      <property name="value" nameId="yvnr.1105725733873:0" value="parens" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174491174779">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="expr" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
  </root>
  <root id="1174510540317">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1175158902584">
      <property name="name" nameId="yvnu.1169194664001:0" value="dotAll" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1175158906851">
      <property name="name" nameId="yvnu.1169194664001:0" value="multiLine" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1175159132192">
      <property name="name" nameId="yvnu.1169194664001:0" value="caseInsensitive" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174510571016">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174510550789">
      <property name="value" nameId="yvnr.1105725733873:0" value="/regexp/" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1174512414484">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1174653421060">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174512444738">
      <property name="value" nameId="yvnr.1105725733873:0" value="if (expr matches regexp) {" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174512449303">
      <property name="value" nameId="yvnr.1105725733873:0" value="match with regexp" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174512427594">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="body" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068580123136:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174512569438">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="expr" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
  </root>
  <root id="1174552240608">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174552330777">
      <property name="value" nameId="yvnr.1105725733873:0" value="?" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174552333310">
      <property name="value" nameId="yvnr.1105725733873:0" value="once or not at all" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1174554186090">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174557628217">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="part" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174557861378:0" resolveInfo="SymbolClassPart" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1174554202498">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1220356709519">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1220356640633:0" resolveInfo="SymbolClassRegexpAndPart" />
    </node>
  </root>
  <root id="1174554211468">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174554226704">
      <property name="value" nameId="yvnr.1105725733873:0" value="[" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174554230659">
      <property name="value" nameId="yvnr.1105725733873:0" value="positive symbol class" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1174554238051">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174554246475">
      <property name="value" nameId="yvnr.1105725733873:0" value="[^" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174554251008">
      <property name="value" nameId="yvnr.1105725733873:0" value="negative symbol class" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1174554386384">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1174555760257">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174554540628">
      <property name="name" nameId="yvnu.1169194664001:0" value="description" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
  </root>
  <root id="1174554406855">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174554418919">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="symbolClass" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174554386384:0" resolveInfo="PredefinedSymbolClassDeclaration" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1174554417184">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
  </root>
  <root id="1174555732504">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174555843709">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="symbolClass" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174554386384:0" resolveInfo="PredefinedSymbolClassDeclaration" />
    </node>
  </root>
  <root id="1174556813606">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174556830202">
      <property name="value" nameId="yvnr.1105725733873:0" value="." />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174556832720">
      <property name="value" nameId="yvnr.1105725733873:0" value="dot regexp (any character)" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1174557861378">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1174557870224">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1220356717885">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1220356640633:0" resolveInfo="SymbolClassRegexpAndPart" />
    </node>
  </root>
  <root id="1174557878319">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174557887320">
      <property name="name" nameId="yvnu.1169194664001:0" value="character" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvor.1200397549879:3" resolveInfo="_CharConstant_String" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3551998361337318997">
      <property name="value" nameId="yvnr.1105725733873:0" value="'" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3551998361337318999">
      <property name="value" nameId="yvnr.1105725733873:0" value="character" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174558301835">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174558315290">
      <property name="name" nameId="yvnu.1169194664001:0" value="start" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvor.1200397549879:3" resolveInfo="_CharConstant_String" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174558317822">
      <property name="name" nameId="yvnu.1169194664001:0" value="end" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvor.1200397549879:3" resolveInfo="_CharConstant_String" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6129327962764786265">
      <property name="value" nameId="yvnr.1105725733873:0" value="-" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6129327962764786267">
      <property name="value" nameId="yvnr.1105725733873:0" value="character range" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174558792178">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174558819022">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="declaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174554386384:0" resolveInfo="PredefinedSymbolClassDeclaration" />
    </node>
  </root>
  <root id="1174564062919">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174564160889">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174564090390">
      <property name="value" nameId="yvnr.1105725733873:0" value="(name:" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174564095782">
      <property name="value" nameId="yvnr.1105725733873:0" value="matching parens" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="8786899561265864288">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1174564103895">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1223986770000">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1223985693348:3" resolveInfo="IVariableAssignment" />
    </node>
  </root>
  <root id="1174565027678">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174565035929">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="match" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174564062919:0" resolveInfo="MatchParensRegexp" />
    </node>
  </root>
  <root id="1174653354106">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174653387388">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174919147781:0" resolveInfo="RegexpExpression" />
    </node>
  </root>
  <root id="1174655989549">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174657169497">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace with regexp" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="6129327962764473901">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174656103019">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="expr" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174656339468">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="replaceBlock" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174656254036:0" resolveInfo="ReplaceBlock" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1174656048646">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
  </root>
  <root id="1174656254036">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1194438891205">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225194692241" />
    </node>
  </root>
  <root id="1174660461415">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174660474120">
      <property name="value" nameId="yvnr.1105725733873:0" value="*?" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547009362">
      <property name="value" nameId="yvnr.1105725733873:0" value="zero or more times, reluctant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174660505718">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174660515579">
      <property name="value" nameId="yvnr.1105725733873:0" value="+?" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547009358">
      <property name="value" nameId="yvnr.1105725733873:0" value="one or more times, reluctant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174660533095">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174660567895">
      <property name="value" nameId="yvnr.1105725733873:0" value="??" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547009360">
      <property name="value" nameId="yvnr.1105725733873:0" value="once or not at all, reluctant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174662351725">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174662369010">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174483125581:0" resolveInfo="RegexpDeclaration" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1174662363321">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
  </root>
  <root id="1174662605354">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174662628918">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174483125581:0" resolveInfo="RegexpDeclaration" />
    </node>
  </root>
  <root id="1174904166999">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174904184877">
      <property name="name" nameId="yvnu.1169194664001:0" value="n" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174904181641">
      <property name="value" nameId="yvnr.1105725733873:0" value="{n}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547009364">
      <property name="value" nameId="yvnr.1105725733873:0" value="exactly n times" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1174904442594">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174904484266">
      <property name="value" nameId="yvnr.1105725733873:0" value="{n,}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547009354">
      <property name="value" nameId="yvnr.1105725733873:0" value="at least n times" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174904477749">
      <property name="name" nameId="yvnu.1169194664001:0" value="n" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" />
    </node>
  </root>
  <root id="1174904605806">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174904757971">
      <property name="value" nameId="yvnr.1105725733873:0" value="{n,m}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6799940379547009356">
      <property name="value" nameId="yvnr.1105725733873:0" value="at least n but not more than m times" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174904618869">
      <property name="name" nameId="yvnu.1169194664001:0" value="n" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1174904621683">
      <property name="name" nameId="yvnu.1169194664001:0" value="m" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" />
    </node>
  </root>
  <root id="1174906321267">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174906385283">
      <property name="value" nameId="yvnr.1105725733873:0" value="(?=" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1174906468661">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174906482383">
      <property name="value" nameId="yvnr.1105725733873:0" value="(?!" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174907373482">
      <property name="value" nameId="yvnr.1105725733873:0" value="negative look ahead" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1174906544517">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174906566584">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="regexp" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1174906564349">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1174906762287">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174906771743">
      <property name="value" nameId="yvnr.1105725733873:0" value="(?&lt;=" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174906781839">
      <property name="value" nameId="yvnr.1105725733873:0" value="positive look behind" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1174906790902">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174906828077">
      <property name="value" nameId="yvnr.1105725733873:0" value="(?&lt;!" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174906837235">
      <property name="value" nameId="yvnr.1105725733873:0" value="negative look behind" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1174909099093">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1174909113141">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="match" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174564062919:0" resolveInfo="MatchParensRegexp" />
    </node>
  </root>
  <root id="1174919147781">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1175158897614">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1175154849582">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175154888102">
      <property name="value" nameId="yvnr.1105725733873:0" value="while (expr =~ regex) {" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1175154880428">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="expr" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1175154946790">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="body" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068580123136:3" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1175155207516">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
  </root>
  <root id="1175161264766">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175161277910">
      <property name="value" nameId="yvnr.1105725733873:0" value="^" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175161280396">
      <property name="value" nameId="yvnr.1105725733873:0" value="line start" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1175161300324">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175161312248">
      <property name="value" nameId="yvnr.1105725733873:0" value="$" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175161317594">
      <property name="value" nameId="yvnr.1105725733873:0" value="line end" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1175164405556">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175164472898">
      <property name="value" nameId="yvnr.1105725733873:0" value="split with" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175164475807">
      <property name="value" nameId="yvnr.1105725733873:0" value="split with regexp" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="6129327962764473903">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1175164443297">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="expr" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1175164412823">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
  </root>
  <root id="1175169009571">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1175169377208">
      <property name="value" nameId="yvnr.1105725733873:0" value="if (expr =~ regex) {" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1175169023932">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="expr" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1175169154112">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="body" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068580123136:3" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1175169017384">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
  </root>
  <root id="1179357154354">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6129327962764464866">
      <property name="value" nameId="yvnr.1105725733873:0" value="matches" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1179357286898">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="inputExpression" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1179357318743">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1179357335121">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1203415418648">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1203415499835">
      <property name="name" nameId="yvnu.1169194664001:0" value="code" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1203415512996:0" resolveInfo="FourDigits" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1203415558957">
      <property name="value" nameId="yvnr.1105725733873:0" value="\uhhhh" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1203415512996" />
  <root id="1220021842985">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1220356033934">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="left" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1220356640633:0" resolveInfo="SymbolClassRegexpAndPart" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1220356007276">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="right" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1220356640633:0" resolveInfo="SymbolClassRegexpAndPart" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1220355672855">
      <property name="value" nameId="yvnr.1105725733873:0" value="&amp;&amp;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3551998361337319001">
      <property name="value" nameId="yvnr.1105725733873:0" value="intersection of classes" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="1220356640633" />
  <root id="1222256539755">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1222263505453">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1222256601675">
      <property name="value" nameId="yvnr.1105725733873:0" value="split with" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1222256601676">
      <property name="value" nameId="yvnr.1105725733873:0" value="split with regexp" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1222256615729">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1222263168901">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
  </root>
  <root id="1222260469397">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1222260599569">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1222260602196">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1222261532126">
      <property name="value" nameId="yvnr.1105725733873:0" value="matches" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1222260556146">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1222261064681">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace with" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1222261064682">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace with regexp" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1222261033031">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="replaceBlock" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174656254036:0" resolveInfo="ReplaceBlock" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1222260586098">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1222260589975">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
  </root>
  <root id="7473568212391781030" />
  <root id="6129327962763158517">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6129327962763909203">
      <property name="value" nameId="yvnr.1105725733873:0" value="=~" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="6129327962763255289">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="inputExpression" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="6129327962763255288">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1174653354106:0" resolveInfo="RegexpUsingConstruction" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="6129327962763255290">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="3796137614137086346">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="3796137614137159270">
      <property name="name" nameId="yvnu.1169194664001:0" value="dotAll" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="3796137614137159271">
      <property name="name" nameId="yvnu.1169194664001:0" value="multiLine" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="3796137614137159272">
      <property name="name" nameId="yvnu.1169194664001:0" value="caseInsensitive" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="3796137614137159273">
      <property name="name" nameId="yvnu.1169194664001:0" value="globalReplace" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="3796137614137159227">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="search" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174482743037:0" resolveInfo="Regexp" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="3796137614137086347">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="replacement" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="3796137614137538898:0" resolveInfo="Replacement" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3796137614137159228">
      <property name="value" nameId="yvnr.1105725733873:0" value="s/regexp/replacement/" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="3796137614137203259">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
  </root>
  <root id="3796137614137538892">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="3796137614137565243">
      <property name="name" nameId="yvnu.1169194664001:0" value="text" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="8942139995508482240">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="3796137614137538894">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="3796137614137539525">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="match" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1174564062919:0" resolveInfo="MatchParensRegexp" />
    </node>
  </root>
  <root id="3796137614137538898">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="3796137614137949772">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
  </root>
</model>

