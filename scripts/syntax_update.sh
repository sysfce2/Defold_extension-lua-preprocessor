java -Xmx500M -cp "scripts/antlr-4.9.3-complete.jar" org.antlr.v4.Tool lua-preprocessor/pluginsrc/com/defold/extension/pipeline/antlr/LuaPreProcLexer.g4 -package com.dynamo.bob.pipeline.antlr
java -Xmx500M -cp "scripts/antlr-4.9.3-complete.jar" org.antlr.v4.Tool lua-preprocessor/pluginsrc/com/defold/extension/pipeline/antlr/LuaPreProc.g4 -package com.dynamo.bob.pipeline.antlr
