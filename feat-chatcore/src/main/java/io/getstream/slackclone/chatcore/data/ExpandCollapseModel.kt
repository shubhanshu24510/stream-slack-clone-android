package io.getstream.slackclone.chatcore.data

data class ExpandCollapseModel(
  val id: Int,
  val title: String,
  val needsPlusButton: Boolean,
  var isOpen: Boolean
)
