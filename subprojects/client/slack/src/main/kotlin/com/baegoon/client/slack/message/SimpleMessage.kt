package com.baegoon.client.slack.message

class SimpleMessage(
    override val text: String,
    override val channel: String,
    override val username: String,
    override val iconEmoji: String
) : Message
